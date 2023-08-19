package com.coursework.sto.controllers;

import com.coursework.sto.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/")
    public String root() {
        return "index";
    }
}
