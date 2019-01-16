package com.example.common;

import com.example.entity.UserInfo;
import com.example.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.List;

public class MyRealm extends AuthorizingRealm {

    // 先加载 解决循环引用
    @Resource(name = "ds_0")
    private DataSource dataSource0;

    @Resource(name = "ds_1")
    private DataSource dataSource1;

    @Autowired
    private UserService userService;

    /**
     * 为当前subject授权
     * @param principalCollection
     * @return AuthorizationInfo
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        UserInfo userInfo = (UserInfo) super.getAvailablePrincipal(principalCollection);
        List<String> userRoleCodes = userService.getUserRoleInfos(userInfo.getUserCode());
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        if(!userRoleCodes.isEmpty()) {
            for(String role : userRoleCodes) {
                info.addRole(role);
            }
        }
//        获取用户权限
//        Set<Permission> permissions = this.permissionMapper.findPermissionsByRoleId(roles);
//        //添加权限
//        for (Permission permission:permissions) {
//            authorizationInfo.addStringPermission(permission.getPermission());
//        }
        return info;
    }

    /**
     * 认证登陆subject身份
     * @param authenticationToken
     * @return AuthenticationInfo
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
//        Map<String, Object> params = new HashMap<>();
//        params.put("userCode", (String)authenticationToken.getPrincipal());
        List<UserInfo> userInfos = userService.getUserInfos((String) authenticationToken.getPrincipal());
        if (userInfos.isEmpty()) {
            throw new UnknownAccountException();
        } else if(userInfos.size() > 1) {
            throw new DisabledAccountException();
        } else {
            UserInfo user = userInfos.get(0);
            // 校验密码
            return new SimpleAuthenticationInfo(user, user.getUserPwd(),  getName());
        }
    }
}