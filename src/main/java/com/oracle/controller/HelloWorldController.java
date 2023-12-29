package com.oracle.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {


    /**
     * Restful 风格
     * @return
     */
    @GetMapping("/hello")
//    @RequestMapping(method = RequestMethod.GET)
    public String hello(){
        return "hello,山东农大！";
    }


}
