package com.example.demo2.test.controller;

        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping(value="/halo")
    public String testapp() {

        return "test";

    }

}
