package com.controller.Impl;

import com.controller.OrderController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@RestController
@RequestMapping("order")
public class OrderControllerImpl implements OrderController {
    @Override
    @GetMapping("findAll")
    public List<String> findAll(String msg) {
        List<String> list=new ArrayList<>();
        list.add(msg);
        list.add(UUID.randomUUID().toString());
        return list;
    }
}
