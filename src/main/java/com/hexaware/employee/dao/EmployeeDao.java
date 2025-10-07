package com.hexaware.employee.dao;

import com.hexaware.employee.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;


    public List<Employee> getEmployee() {
        String sql= "select * from employee";
//        return jdbcTemplate.query(sql, new RowMapper<Employee>() {
//            @Override
//            public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
//                return new Employee(rs.getInt(1),rs.getString(2));
//            }
//        });
        return jdbcTemplate.query(sql, (rs, rowNum) -> new Employee(rs.getInt(1),rs.getString(2)));
    }
}