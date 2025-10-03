package com.hexaware.employee.service;

import com.hexaware.employee.model.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    Logger logger = LoggerFactory.getLogger(EmployeeService.class);
    static List<Employee> employeeList = new ArrayList<>();
    static {
        employeeList.add(new Employee(1,"Sachin") );
        employeeList.add(new Employee(2,"Sayantani"));
        employeeList.add(new Employee(3,"Kesav"));
    }
    public List<Employee> getAllEmployees() {
        return employeeList;
    }

    public Employee addEmployee(Employee employee) {
        employeeList.add(employee);
        return employee;
    }

    public Employee getEmployee(Integer index) {
        return employeeList.get(index);
    }

    public Employee updateEmployee(Integer index, Employee employee) {
        employeeList.set(index, employee);
        return employee;
    }

    public void deleteEmployee(int index) {
        employeeList.remove(index);
    }
}