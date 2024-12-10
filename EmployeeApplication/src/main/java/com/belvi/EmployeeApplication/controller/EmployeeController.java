package com.belvi.EmployeeApplication.controller;

import com.belvi.EmployeeApplication.entity.Employee;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class EmployeeController {

    public List<Employee> findAllEmployee(){
         List<Employee> employeeList = Arrays.asList(
                new Employee(1, "First Employee", "Messassi"),
                new Employee(2, "Second Employee", "Douala")
        );
        return employeeList;
    }
}
