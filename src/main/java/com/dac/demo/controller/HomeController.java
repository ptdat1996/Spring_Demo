package com.dac.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class HomeController {
    @GetMapping("/")
    public String index(){
        return "/user/index";
    }

    @GetMapping("/login")
    public String login(){
        return "/user/login";
    }
    @GetMapping("/sign-up")
    public String sign_up(){
        return "/user/sign-up";
    }
}
