package com.zzx.country.controllers;

import com.zzx.country.repositories.CountryRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CountryController {

    @Autowired
    CountryRepositories countryRepositories;

    @GetMapping("/")
    public String showPage(Model model, @RequestParam(defaultValue = "0") int page){
        model.addAttribute("data",
                countryRepositories.findAll(new PageRequest(page, 4)));
        return "index";
    }
}
