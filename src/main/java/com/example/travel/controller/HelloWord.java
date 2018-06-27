package com.example.travel.controller;


import com.example.travel.pojo.User;
import com.example.travel.service.PersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class HelloWord {

    Logger logger = LoggerFactory.getLogger(HelloWord.class);
    @Resource
    private PersonService personService;
    @GetMapping("/")
    public String hello(){
        return "hello,this is a springboot demo3";
    }
    @RequestMapping("/hello3")
    public String hello3(){
        return "addstu";
    }
    @RequestMapping("/hello4")
    public List<User> hello4(){
        return personService.select();
    }
}
