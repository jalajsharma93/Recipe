package com.example.Recipe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"/","","/index"})
    public String getIndexPage(){
        System.out.println("Hello there");
        return "recipeIndex";
    }
}
