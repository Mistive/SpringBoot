package com.example.demo2.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

    @RequestMapping("/ttt")
    public ModelAndView ttt() throws Exception {
        ModelAndView mav = new ModelAndView("test");
        mav.addObject("name", "Mistive");
        List<String> testList = new ArrayList<String>();
        testList.add("a");
        testList.add("b");
        testList.add("c");
        mav.addObject("list", testList);

        return mav;
    }


}
