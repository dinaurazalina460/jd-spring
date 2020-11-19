package com.cybertek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String getRequestMapping() {

        return "home";

    }

    @RequestMapping("/dina")
    public String getRequestMapping2() {

        return "home";

    }

    @RequestMapping(method = RequestMethod.GET, value = "/cybertek")
    public String getRequestMapping3() {

        return "home";

    }

    @GetMapping
    public String getMappingExample() {
        return "home";
    }


    @GetMapping("/home/{name}")
    public String pathVariableExample(@PathVariable("name") String name){
        System.out.println("My name is "+name);
        return "home";
    }

    @GetMapping("/home/course")
    public String requestParamExample(@RequestParam("course") String course){
        System.out.println("course is "+ course);
        return "home";
    }

    @GetMapping(value="home/course2")
    public String requestParam2(@RequestParam(value = "course2", required = false, defaultValue = "Cybertek") String name){
        System.out.println("name is "+ name);
        return "home";
    }
}
