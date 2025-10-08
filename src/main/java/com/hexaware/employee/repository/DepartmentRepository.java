package com.hexaware.employee.repository;

import com.hexaware.employee.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}


//JpaRepository extends CrudRepository