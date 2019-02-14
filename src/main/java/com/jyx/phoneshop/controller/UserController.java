package com.jyx.phoneshop.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "个人中心")
@RestController
@CrossOrigin
public class UserController {

    @ApiOperation(value = "测试接口")
    @PostMapping("cesi.do")
    public int cesi(){
        System.out.println("aaaaa");
        return 1;
    }
}
