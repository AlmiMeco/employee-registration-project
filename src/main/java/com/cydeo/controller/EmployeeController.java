package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {



    @RequestMapping("/register")
    public String createEmployee(Model model){



        return "employee/register";
    }


}
