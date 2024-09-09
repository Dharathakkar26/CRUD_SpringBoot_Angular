package com.crud.crud.entity;

import jakarta.persistence.*;

@Entity//table create
@Table(name="employee")

public class Employee {

    @Id //generate primary key
    @GeneratedValue(strategy = GenerationType.AUTO)//ID will be generated automatically by springboot
    private Integer employeeId;
    private String employeeName;
    private String employeeContactNumber;
    private String employeeAddress;
    private String employeeGender;
    private String employeeDepartment;


    public Employee(){

    }


    public Integer getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeContactNumber() {
        return employeeContactNumber;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public String getEmployeeGender() {
        return employeeGender;
    }

    public String getEmployeeDepartment() {
        return employeeDepartment;
    }





}
