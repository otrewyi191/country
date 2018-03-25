package com.zzx.country.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CountryController {

    @GetMapping("/")
    public String showPage(){
        return "index";
    }
}
