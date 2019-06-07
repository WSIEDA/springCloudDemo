package com.jsoft.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/customer")
@RestController
public class ConstomerCtr {

    @RequestMapping("info")
    public String userInfo() {
        return "my name is king";
    }
}
