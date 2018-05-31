package com.svr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//返回视图  返回json格式   使用@RestController注解
@Controller
public class DomeController {

	
	    @GetMapping("/dept/save")
	    // @requestBody注解常用来处理content-type不是默认的application/x-www-form-urlcoded编码的内容，
	    //比如说：application/json或者是application/xml等。一般情况下来说常用其来处理application/json类型
	    //使用了这个注解，前台传递过来的数据必须是json 格式的，否则无法正常存储数据到数据库
	    public String save() {
	        return "index";
	    }
}