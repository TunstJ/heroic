package com.svr.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Dome {
    //@RequestMapping(value = "/hello",method = RequestMethod.GET) 
    @RequestMapping("/")
    public String hello() {  
        return "index";  
    }  
}
