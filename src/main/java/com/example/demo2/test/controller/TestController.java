package com.example.demo2.test.controller;

import com.example.demo2.test.service.TestService;
import com.example.demo2.test.vo.TestVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping(value = "/")
    public String home() throws Exception{
        return "Hello World";
    }

    @RequestMapping(value = "/test")
    public ModelAndView test() throws Exception {

        List<TestVo> testList = testService.selectTest();

        ModelAndView mav = new ModelAndView();
        mav.addObject("list", testList);
        return mav;
    }


}
