package com.example.demo2.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TestController {

    @RequestMapping(value = "/home")
    public String home() {
        return "home.html";
    }

    @ResponseBody
    @RequestMapping("/valueTest")
    public String valueTest() {
        String value = "테스트 String";
        return value;
    }
}


