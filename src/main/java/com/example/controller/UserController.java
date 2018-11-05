package com.example.controller;

import com.example.common.Result;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/test")
    public Result test(){
        return Result.ok("dsajkhdkjsa");
    }

    @GetMapping("/pick/{uid}")
    public Result pickUser(@PathVariable("uid") Integer uid){
        return Result.ok(userService.pickUserById(uid));
    }

    @GetMapping("/page/{page}/{rows}")
    public Result queryUsersByPage(@PathVariable("page") Integer page, @PathVariable("rows") Integer rows){
        return Result.ok(userService.queryUsersByPage(page, rows));
    }
}
