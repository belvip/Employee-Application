package com.belvi.EmployeeApplication.controller;

import com.belvi.EmployeeApplication.entity.Employee;
import com.belvi.EmployeeApplication.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/api/public/employees")
    public List<Employee> findAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @RequestMapping("/api/public/employees/{id}")
    public Employee findAllEmployee(@PathVariable int id){
        return employeeService.getAnEmployee(id);

    }
}
