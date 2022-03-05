package ru.javamentor.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NewController {

    @GetMapping(value = "/")
    public String startPages(ModelMap model) {
        return "index";
    }
}
