package com.example.common.validator;


import com.example.common.annotations.EnumValid;
import lombok.extern.slf4j.Slf4j;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

@Slf4j
public class EnumValidtor implements ConstraintValidator<EnumValid,Object> {

    Class<?>[] cls; //枚举类

    String methodStr;

    @Override
    public void initialize(EnumValid constraintAnnotation) {
        cls = constraintAnnotation.target();
        methodStr = constraintAnnotation.method();
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        if (cls.length > 0) {
            for (Class<?> cl : cls
            ) {
                try {
                    if (cl.isEnum()) {
                        //枚举类验证
                        Object[] objs = cl.getEnumConstants();
                        Method method = cl.getMethod(methodStr);
                        for (Object obj : objs
                        ) {
                            Object code = method.invoke(obj);
                            if (Objects.equals(value, code)) {
                                return true;
                            }
                        }
                    }
                } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                    log.info(e.getMessage(), e);
                }
            }
        } else {
            return true;
        }
        return false;
    }
}
