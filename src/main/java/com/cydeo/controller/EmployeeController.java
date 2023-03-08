package com.cydeo.controller;

import com.cydeo.bootstrap.DataGenerator;
import com.cydeo.model.Employee;
import com.cydeo.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;  // [Dependency Injection added]

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @RequestMapping("/register")
    public String createEmployee(Model model) {

        model.addAttribute("employee", new Employee());
        model.addAttribute("states", DataGenerator.stateList());

        return "employee/register";
    }

    @PostMapping("/confirm")
    public String confirmEmployee(@ModelAttribute("employee") Employee employee) {

        employeeService.saveEmployee(employee);

        return "redirect:/employee/list";
    }

    @GetMapping("/list")
    public String listEmployees(Model model) {

        model.addAttribute("employeeList", employeeService.printEmployeeList());

        return "employee/confirm";

    }

}
