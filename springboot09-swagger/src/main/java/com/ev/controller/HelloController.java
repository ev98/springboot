package com.ev.controller;

import com.ev.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "Swagger")
@RestController
public class HelloController {

    @ApiOperation("hello-ev")
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    //只要接口中返回值中存在实体类，他就会被扫描到swagger中
    @ApiOperation("用户")
    @PostMapping("/user")
    public User User(){
        return new User();
    }


}
