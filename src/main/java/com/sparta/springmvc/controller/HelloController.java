package com.sparta.springmvc.controller;

import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api")
public class HelloController {
    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello world";
    }

    @GetMapping("/get")
    @ResponseBody
    public String get(){
        return "GET Method 요청";
    }

    @PostMapping("/post")
    @ResponseBody
    public String post(){
        return "POST Method 요청";
    }

    @PostMapping("/hello")  //경로 중복 가능, 메서드 중복 불가
    @ResponseBody
    public String post2(){
        return "POST Method 요청";
    }

    @PutMapping("/put")
    @ResponseBody
    public String put(){
        return "PUT Method 요청";
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public String delete(){
        return "DELETE Method 요청";
    }
}
