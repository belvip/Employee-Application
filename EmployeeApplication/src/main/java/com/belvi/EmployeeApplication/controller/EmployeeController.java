package com.belvi.EmployeeApplication.controller;

import com.belvi.EmployeeApplication.entity.Employee;
import com.belvi.EmployeeApplication.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/api/admin/employees", method = RequestMethod.POST)
    public void createEmployee(@RequestBody Employee employee){
        employeeService.createEmployee(employee);
    }

    @RequestMapping(value = "/api/admin/employees/{id}", method = RequestMethod.PUT)
    public void updateEmployee(@PathVariable int id, @RequestBody Employee employee){
        employeeService.updateEmployee(employee);
    }

    @RequestMapping(value = "/api/admin/employees/{id}", method = RequestMethod.DELETE)
    public List<Employee> deleteEmployee(@PathVariable int id){
        employeeService.deleteEmployee(id);

        return employeeService.getAllEmployees();
    }
}
