package com.example.controller;

import com.example.common.Result;
import com.example.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Api(value = "UserController|一个用来测试控制器")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/test")
    public Result test(){
        return Result.ok("dsajkhdkjsa");
    }

    @GetMapping("/pick/{uid}")
    @ApiOperation(value="根据用户id获取用户", notes="test: 仅1和2有正确返回")
    @ApiImplicitParam(paramType="query", name = "uid", value = "用户id", required = true, dataType = "Integer")
    public Result pickUser(@PathVariable("uid") Integer uid){
        return Result.ok(userService.pickUserById(uid));
    }

    @GetMapping("/page/{page}/{rows}")
    @ApiOperation(value="根据页码分页查询用户", notes="test: 仅1和2有正确返回")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "page", value = "页数", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "rows", value = "条数", required = true, dataType = "Integer"),
    })
    public Result queryUsersByPage(@PathVariable("page") Integer page, @PathVariable("rows") Integer rows){
        return Result.ok(userService.queryUsersByPage(page, rows));
    }
}
