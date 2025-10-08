package com.hexaware.employee.repository;

import com.hexaware.employee.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
}


// CrudRespository --> Insert Update Delete and select
