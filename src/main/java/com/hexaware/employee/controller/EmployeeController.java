package com.hexaware.employee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {
   static List<String> employees = new ArrayList<>();
   static {
        employees.add("Sachin");
        employees.add("Sayantani");
        employees.add("Kesav");
    }

    @GetMapping("/test")
    public List<String> getAllEmployees() {
        return employees;
    }
}