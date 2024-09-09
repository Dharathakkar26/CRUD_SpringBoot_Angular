package com.crud.crud.service;

import com.crud.crud.dao.EmployeeDao;
import com.crud.crud.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;


    public Employee saveEmployee(Employee employee)
    {

        return employeeDao.save(employee);
    }

    public List<Employee> getEmployees(){
        List<Employee> employees = new ArrayList<>();
        employeeDao.findAll().forEach(employees::add);
        return employees;

    }


    public Employee getEmployees(Integer employeeId){

        return employeeDao.findById(employeeId).orElseThrow();
    }

    public void deleteEmployee(Integer employeeId){
        employeeDao.deleteById(employeeId);
    }

    public Employee updateEmployee(Employee employee){
        employeeDao.findById(employee.getEmployeeId()).orElseThrow();//orElseThrow:-if it will find the id which is going to be update it will return by findId but if not than it will return an exception
        return employeeDao.save(employee);
    }
}
