package com.crud.crud.controller;

import com.crud.crud.entity.Employee;
import com.crud.crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;


    @PostMapping("/save/employee")
    public Employee saveEmployee(@RequestBody Employee employee){

        return employeeService.saveEmployee(employee);
    }

    //get all the details from the database
    @GetMapping("/get/employee")
    public List<Employee> getEmployees(){
        return employeeService.getEmployees();

    }

    //get some specific row from whole table
    @GetMapping("/get/employee/{employeeId}")
    public Employee getEmployee(@PathVariable Integer employeeId){
return employeeService.getEmployees(employeeId);
    }



    //delete operation
    @DeleteMapping("/delete/employee/{employeeId}")
    public void deleteEmployee(@PathVariable Integer employeeId){
        employeeService.deleteEmployee(employeeId);
    }

    @PutMapping("/update/employee")
    public Employee updateEmployee(@RequestBody Employee employee){
        return employeeService.updateEmployee(employee);
    }

}
