package com.example.utils;

import com.example.common.MyRealm;
import com.example.dto.UserInfoDto;
import com.example.entity.UserInfo;
import com.example.enums.RoleEnum;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Slf4j
@Component
public class UserInfoUtils implements InitializingBean {

    @Autowired
    MyRealm myRealm;

    private static MyRealm staticMyRealm = null;

    private static ThreadLocal<UserInfoDto> threadLocal = new ThreadLocal<>();

    /**
     * 获取用户信息
     * @return
     */
    public static UserInfoDto getUserInfo(){
        UserInfoDto userInfoDto = threadLocal.get();
        if(userInfoDto == null){
            Subject subject = SecurityUtils.getSubject();
            userInfoDto = new UserInfoDto();
            try {
                UserInfo userInfo = (UserInfo) subject.getPrincipals().getPrimaryPrincipal();
                userInfoDto.setUserCode(userInfo.getUserCode());
                userInfoDto.setId(userInfo.getId());
                userInfoDto.setUserName(userInfo.getUserName());
                AuthorizationInfo roles = staticMyRealm.getAuthorizationCache().get(SecurityUtils.getSubject().getPrincipals());
                Object[] roles1 = roles.getRoles().toArray();
                List list = Arrays.asList(roles1);
                userInfoDto.setRoleCodes(list);
            }catch (Exception e){
                log.info(e.getMessage());
            }
        }
        return userInfoDto;
    }

    /**
     *
     * @param roleEnum
     * @return
     */
    public static boolean hasRole(RoleEnum roleEnum){
        Subject subject = SecurityUtils.getSubject();
        return subject.hasRole(roleEnum.getCode());
    }

    /**
     *
     * @param roleEnum
     */
    public static void checkRole(RoleEnum roleEnum){
        Subject subject = SecurityUtils.getSubject();
        subject.checkRole(roleEnum.getCode());
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        staticMyRealm = myRealm;
    }
}
