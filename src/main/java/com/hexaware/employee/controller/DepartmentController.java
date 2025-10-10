package com.hexaware.employee.controller;

import com.hexaware.employee.entity.Department;
import com.hexaware.employee.entity.Employee;
import com.hexaware.employee.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/departments")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @GetMapping
    public List<Department> getDepartments(){
        return departmentService.getAllDepartments();
    }
    @PostMapping
    public Department createDepartment(@RequestBody Department department) {
        return departmentService.createDepartment(department);
    }
    @GetMapping("/{id}")
    public Department getDepartment(@PathVariable Long id) {
        return departmentService.getDepartment(id);
    }
    @GetMapping("/{id}/employees")
    public ResponseEntity<com.hexaware.employee.model.Department> getEmployeesByDepartment(@PathVariable Long id) {
    return new ResponseEntity<>(departmentService.getDepartmentWithEmployees(id), HttpStatus.OK);
    }
}