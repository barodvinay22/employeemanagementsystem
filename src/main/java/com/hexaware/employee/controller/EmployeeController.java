package com.hexaware.employee.controller;

import com.hexaware.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    private final EmployeeService employeeService1;
    EmployeeController(EmployeeService employeeService) {
        this.employeeService1 = employeeService;
    }
    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public ResponseEntity<List<String>>  getAllEmployees() {
        return new ResponseEntity<>(employeeService.getAllEmployees(), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<String> addEmployee(@RequestBody String name){
       employees.add(name);
       return new ResponseEntity<>(name,HttpStatus.CREATED);
    }
    @GetMapping("/{index}")
    public ResponseEntity<String> getEmployee(@PathVariable("index") Integer index){
       return new ResponseEntity<>(employees.get(index), HttpStatus.OK);
    }
    @PutMapping("/{index}")
    public ResponseEntity<String> updateEmployee(@PathVariable("index") Integer index,@RequestBody String name){
       employees.set(index, name);
        return new ResponseEntity<>(name,HttpStatus.OK);
    }
    @DeleteMapping("/{index}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable("index") int index){
       employees.remove(index);
       return new ResponseEntity<>(HttpStatus.OK);
    }
}