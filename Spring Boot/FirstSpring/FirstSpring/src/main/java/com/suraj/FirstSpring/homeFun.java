package com.suraj.FirstSpring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homeFun {
    @RequestMapping("/")
    public String greeeet(){
        return "It's Show Time!!!!";
    }
}
