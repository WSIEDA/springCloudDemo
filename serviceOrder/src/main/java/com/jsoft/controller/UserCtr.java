package com.jsoft.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserCtr {

    @RequestMapping("who")
    public String who() {
        return "my name is liangwang";
    }
}
