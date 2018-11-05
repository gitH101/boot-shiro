package com.example.service;

import com.example.entity.User;
import com.example.mapper.UserRoleRDao;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.example.entity.UserInfo;
import com.example.mapper.RoleInfoDao;
import com.example.mapper.UserInfoDao;
import com.example.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserInfoDao userInfoDao;

    @Autowired
    private RoleInfoDao roleInfoDao;

    @Autowired
    private UserRoleRDao userRoleRDao;

    private Logger logger = LoggerFactory.getLogger(UserService.class);

    public User pickUserById(Integer uid){
         logger.info("查询用户：{}",uid);
         return userMapper.selectByPrimaryKey(uid);
    }

    public PageInfo<User> queryUsersByPage(Integer page, Integer rows){
        logger.info("查询用户：{},{}",page, rows);
        PageHelper.startPage(page, rows);
        List<User> users = userMapper.selectAll();
        return new PageInfo<User>(users);
    }

    public List<UserInfo> getUserInfos(String userCode){
        Example example = new Example(UserInfo.class);
        example.createCriteria().andEqualTo("userCode", userCode);
        return userInfoDao.selectByExample(example);
    }

    public List<String> getUserRoleInfos(String userCode){
//        Example example = new Example(RoleInfo.class);
//        example.createCriteria().andEqualTo("userCode", userCode);
        return userRoleRDao.queryRoleByUser(userCode);
    }
}
