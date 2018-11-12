package com.example.common;

import com.example.enums.OPCExceptionEnum;
import com.example.exceptions.OPCException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.HandlerMethod;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler()
    @ResponseBody
    public Result exceptionHandle(Object handler,Exception e){ // 处理方法参数的异常类型
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        String className = handlerMethod.getBeanType().getName();
        String methodName = handlerMethod.getMethod().getName();
        log.info("{}-{}:",className,methodName,e);
        return Result.error(e.getMessage()); //自己需要实现的异常处理
    }

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Result handle(Object handler, OPCException e){
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        String className = handlerMethod.getBeanType().getName();
        String methodName = handlerMethod.getMethod().getName();
        log.info("{}-{}:",className,methodName,e);
        return Result.error(e.getErrCode(),e.getMessage()); //自己需要实现的异常处理
    }

    public Result handle(Exception e){
        return null;
    }

    /**
     * 只返回第一条校验失败信息
     * @param e
     * @return
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public Result handle(MethodArgumentNotValidException e){
        log.info("{} -- 参数检查失败",e.getParameter().getMethod().getName(), e);
        List<FieldError> fieldErrors = e.getBindingResult().getFieldErrors();
//        for (FieldError error: fieldErrors){
//            log.info(error.getField() + ":" + error.getDefaultMessage());
//        }
        return Result.error(OPCExceptionEnum.PARAN_NULL_ERR.getCode(),fieldErrors.get(0).getDefaultMessage());
    }
}
