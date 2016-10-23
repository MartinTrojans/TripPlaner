package com.example.tripplaner.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Martin on 10/23/16.
 */
@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping("/home")
    public String getHomePage() {
        return "index";
    }
}
