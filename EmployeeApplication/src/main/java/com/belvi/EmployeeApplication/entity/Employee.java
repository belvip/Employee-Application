package com.belvi.EmployeeApplication.entity;

public class Employee {
    int employeeId;
    String employeeName;
    String EmployeeCity;

    public Employee(int employeeId, String employeeName, String employeeCity) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        EmployeeCity = employeeCity;
    }
}
