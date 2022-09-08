package com.ceva.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

    @RequestMapping("/welcome")
    public String homePage(Model model){

        //Model methods
        model.addAttribute("name", "Ceva");
        model.addAttribute("course" , "MVC");
        model.addAttribute("subject", "");


        return "student/welcome";
    }

}