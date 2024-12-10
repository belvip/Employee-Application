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

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeCity() {
        return EmployeeCity;
    }

    public void setEmployeeCity(String employeeCity) {
        EmployeeCity = employeeCity;
    }
}
