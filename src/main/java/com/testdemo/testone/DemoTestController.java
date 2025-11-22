package com.testdemo.testone;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoTestController {
    @RequestMapping("/hello")
    public String Hello(){
        return "hello.html";
    }
}
