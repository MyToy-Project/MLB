package com.project.mlb.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LayoutController {

    @GetMapping
    public String index() {
        return "/mlb/index";
    }
}
