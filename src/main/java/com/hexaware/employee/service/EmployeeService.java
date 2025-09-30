package com.hexaware.employee.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    Logger logger = LoggerFactory.getLogger(EmployeeService.class);
    static List<String> employees = new ArrayList<>();
    static {
        employees.add("Sachin");
        employees.add("Sayantani");
        employees.add("Kesav");
    }
    public List<String> getAllEmployees() {
        logger.info("Get all employees");
        logger.debug("Get all employees");
        logger.warn("Get all employees");
        logger.error("Get all employees");
        return employees;
    }
}