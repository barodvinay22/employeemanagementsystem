package com.hexaware.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication// Contains AutoConfiguration Component Scan
public class EmployeeManagementSystemApplication {
    static {
        System.out.println("Employee Management System Application Initialized");
    }
	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementSystemApplication.class, args);
	}

}
