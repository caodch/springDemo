package com.caodch.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    /**
     *
     * @return
     */
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String getHello(){

        return "Hello World";
    }
}
