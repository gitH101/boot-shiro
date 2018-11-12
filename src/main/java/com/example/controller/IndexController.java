package com.example.controller;

import com.example.common.Result;
import com.example.entity.UserInfo;
import com.example.enums.OPCExceptionEnum;
import com.example.enums.RoleEnum;
import com.example.exceptions.OPCException;
import com.example.vo.UserInfoVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/auth")
@Api(value = "IndexController|用户登录注销操作")
public class IndexController {

    private static Logger logger = LoggerFactory.getLogger(IndexController.class);

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @PostMapping("/login2")
    public ModelAndView login2(UserInfoVo userInfo){
        Result result = loginIn(userInfo);
        if(result.getCode() == 200){
            return new ModelAndView("redirect:/swagger-ui.html");
        }else {
            ModelAndView modelAndView = new ModelAndView("index");
            modelAndView.addObject("tips","登录失败");
            return modelAndView;
        }
    }

    @PostMapping("/login")
    @ResponseBody
    @ApiOperation(value="用户登录", notes="test: 仅1和2有正确返回")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "userCode", value = "用户编码", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "userPwd", value = "用户密码", required = true, dataType = "String"),
    })
    public Result loginIn(@RequestBody @Validated UserInfoVo userInfo) {
        // shiro认证
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(userInfo.getUserCode(), userInfo.getUserPwd());
        try {
            subject.login(token);
        } catch (UnknownAccountException e) {
            return Result.error( "账户不存在");
        } catch (DisabledAccountException e) {
            return Result.error("账户存在问题");
        } catch (AuthenticationException e) {
            return Result.error("密码错误");
        } catch (Exception e) {
            logger.info("登陆异常", e);
            return Result.error("登陆异常");
        }
        String res = subject.getPrincipals().toString();
        for (RoleEnum role: RoleEnum.values()){
            if (subject.hasRole(role.getCode())) {
                res = res + "----------你拥有"+role.getName()+"权限";
                return Result.ok(res, role.getCode());
            }
        }
        throw new OPCException(OPCExceptionEnum.NO_ROLE);
    }
}
