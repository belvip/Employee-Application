package com.belvi.EmployeeApplication.service;


import com.belvi.EmployeeApplication.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {
    List<Employee> employeeList = Arrays.asList(
            new Employee(1, "First Employee", "Messassi"),
            new Employee(2, "Second Employee", "Douala")
    );

    public List<Employee> getAllEmployees(){
        return employeeList;
    }

    public Employee getAnEmployee(int id){
        return employeeList.stream()
                .filter(e -> (e.getEmployeeId() == id))
                .findFirst().get();
    }
}
