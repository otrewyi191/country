package com.zzx.country.controllers;

import com.zzx.country.entites.Country;
import com.zzx.country.repositories.CountryRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @PostMapping("/save")
    public String save(Country c){
        countryRepositories.save(c);
        return "redirect:/";
    }


    @GetMapping("/delete")
    public String deleteCountry(Integer id){
        countryRepositories.delete(id);
        return "redirect:/";
    }

    @GetMapping("/findOne")
    @ResponseBody
    public Country findOne(Integer id){
        Country one = countryRepositories.findOne(id);
        return one;
    }
}
