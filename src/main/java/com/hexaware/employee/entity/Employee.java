package com.hexaware.employee.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "emp")
public class Employee {
    @Id
    @Column(name = "emp_id")
    private Integer id;
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    private Profile profile;
    @ManyToOne(cascade = CascadeType.ALL)
    private Department department;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Employee() {

    }
    public Employee(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}