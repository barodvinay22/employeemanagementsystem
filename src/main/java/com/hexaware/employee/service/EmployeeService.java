package com.hexaware.employee.service;

import com.hexaware.employee.dao.EmployeeDao;
import com.hexaware.employee.model.Employee;
import com.hexaware.employee.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private EmployeeDao employeeDao;
    
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private DepartmentService departmentService;
    
    Logger logger = LoggerFactory.getLogger(EmployeeService.class);
    static List<Employee> employeeList = new ArrayList<>();
    static {
        employeeList.add(new Employee(1,"Sachin") );
        employeeList.add(new Employee(2,"Sayantani"));
        employeeList.add(new Employee(3,"Kesav"));
    }
    public List<Employee> getAllEmployees() {
        //return employeeList;
       // return employeeDao.getEmployee();
        List<Employee> employeeList = new ArrayList<>();
        employeeRepository.findAll().forEach(employee -> {employeeList.add(new Employee(employee.getId(),employee.getName()));});
        return employeeList;
    }

    public Employee addEmployee(Employee employee) {
//        employeeList.add(employee);
//        return employee;
        com.hexaware.employee.entity.Employee employeeEntity= new com.hexaware.employee.entity.Employee(employee.getId(),employee.getName());
        employeeEntity.setDepartment(departmentService.getDepartment(employee.getDepartmentId()));
       com.hexaware.employee.entity.Employee savedEmployee= employeeRepository.save(employeeEntity);

        return  new Employee(savedEmployee.getId(),savedEmployee.getName());
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

    public void runQuery(String query) {
        //jdbcTemplate.execute(query);//DDL and DML
        jdbcTemplate.update(query);

        // DDL --> Data definition Language --> Create table index
        // DML--> Daat Manipulating Language--> Insert update delete and select
    }

    public Employee getEmployeeById(Integer id) {
       Optional<com.hexaware.employee.entity.Employee> optionalEmployee= employeeRepository.findById(id);
       if(optionalEmployee.isPresent()) {
           return new Employee(optionalEmployee.get().getId(),optionalEmployee.get().getName());
       }
       return null;
    }

    public Employee updateEmployeeById(Integer id, Employee employee) {
        Optional<com.hexaware.employee.entity.Employee> optionalEmployee= employeeRepository.findById(id);
        if(optionalEmployee.isPresent()) {
            com.hexaware.employee.entity.Employee employeeEntity= optionalEmployee.get();
            employeeEntity.setName(employee.getName());
            employeeRepository.save(employeeEntity);
        }
        return new Employee(id,employee.getName());
    }

    public void deleteEmployeeById(int id) {
        employeeRepository.deleteById(id);
    }
}