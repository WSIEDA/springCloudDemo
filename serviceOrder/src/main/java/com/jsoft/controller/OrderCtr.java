package com.jsoft.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RequestMapping("/order")
@RestController
public class OrderCtr {

    @RequestMapping("/info")
    public String orderInfo() {
        return "order info date : " + new Date().toString();
    }
}
