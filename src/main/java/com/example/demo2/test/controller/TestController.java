package com.example.demo2.test.controller;

import com.example.demo2.test.vo.TestVo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @RequestMapping("/thymeleafTest")
    public String thymeleafTest(Model model) {
        TestVo testModel = new TestVo("ID(mistive)", "NAME(MISTIVE)");
        model.addAttribute("testModel", testModel);
        return "thymeleaf/thymeleafTest";
    }
}


