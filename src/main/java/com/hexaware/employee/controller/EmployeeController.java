package com.hexaware.employee.controller;

import com.hexaware.employee.model.Employee;
import com.hexaware.employee.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @GetMapping
    public ResponseEntity<List<Employee>>  getAllEmployees() {
        return new ResponseEntity<>(employeeService.getAllEmployees(), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee name){
       return new ResponseEntity<>(employeeService.addEmployee(name),HttpStatus.CREATED);
    }
    @GetMapping("/{index}")
    public ResponseEntity<Employee> getEmployee(@PathVariable("index") Integer index){
       return new ResponseEntity<>(employeeService.getEmployee(index), HttpStatus.OK);
    }
    @PutMapping("/{index}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable("index") Integer index,@RequestBody Employee employee){

        return new ResponseEntity<>(employeeService.updateEmployee(index,employee),HttpStatus.OK);
    }
    @DeleteMapping("/{index}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable("index") int index){
        employeeService.deleteEmployee(index);
       return new ResponseEntity<>(HttpStatus.OK);
    }
    @PostMapping("/runQuery")
    public ResponseEntity<Void> runQuery(@RequestBody String query){
        employeeService.runQuery(query);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}