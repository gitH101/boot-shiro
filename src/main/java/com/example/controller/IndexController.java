package com.example.controller;

import com.example.common.Result;
import com.example.entity.UserInfo;
import com.example.exceptions.OPCException;
import com.example.enums.OPCExceptionEnum;
import com.example.enums.RoleEnum;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class IndexController {

    private static Logger logger = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping("/login")
    public Result loginIn(@RequestBody UserInfo userInfo) {
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
