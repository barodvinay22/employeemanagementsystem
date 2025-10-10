package com.hexaware.employee.service;

import com.hexaware.employee.entity.Department;
import com.hexaware.employee.entity.Employee;
import com.hexaware.employee.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }
    @Transactional
    public Department createDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public Department getDepartment(Long id) {
        return departmentRepository.findById(id).orElseThrow(()-> new RuntimeException("DepartmentNotExists"));
    }

    public com.hexaware.employee.model.Department getDepartmentWithEmployees(Long id) {
        Department department= departmentRepository.findById(id).orElseThrow(()-> new RuntimeException("DepartmentNotExists"));
        com.hexaware.employee.model.Department departmentWithEmployees = new com.hexaware.employee.model.Department();
        departmentWithEmployees.setDepartmentId(department.getId());
        departmentWithEmployees.setDepartmentName(department.getName());
        departmentWithEmployees.setEmployees(department.getEmployees().stream().map(this::toEmployeeModel).toList());
        return departmentWithEmployees;
    }

    private com.hexaware.employee.model.Employee toEmployeeModel(Employee employee) {
        com.hexaware.employee.model.Employee employeeModel = new com.hexaware.employee.model.Employee(employee.getId(),employee.getName());
        return employeeModel;
    }
}