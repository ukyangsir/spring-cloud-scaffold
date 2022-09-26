package com.ukyang.webserver.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Web 用户客户端控制器
 *
 * @author ukyang
 * @version v1.0.0
 * @since 2022-09-27 00:07
 */
@Slf4j
@Api(tags = "Web 用户客户端控制器")
@RestController
@RequestMapping("/user")
public class UserController {

    @ApiOperation(value = "查询所有")
    @GetMapping
    public String listAll(){
        return "hello";
    }
}
