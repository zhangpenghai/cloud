package com.controller.Impl;

import com.controller.UserController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;


@RestController
@RequestMapping("user")
public class UserControllerImpl implements UserController {
    @GetMapping("findAll")
    @Override
    public String findAll(String msg) {
        System.out.println("你在使用findAll："+msg);
        return msg+"时间："+new SimpleDateFormat("H:M:s").format(new Date()).toString();
    }

    @Override
    @GetMapping("findOne")
    public String findOne(String msg) {
        System.out.println("你在使用findOne："+msg);
        return msg+"时间："+new SimpleDateFormat("H:M:s").format(new Date()).toString();

    }
}
