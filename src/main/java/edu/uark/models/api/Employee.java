package edu.uark.models.api;

import edu.uark.models.entities.EmployeeEntity;

public class Employee {
    /*record id may not be needed from database*/
    private String recordId;
    public String getRecordId() {
        return this.recordId;
    }
    public Employee setRecordId(String id) {
        this.recordId = id;
        return this;
    }

    private String firstName;
    public String getFirstName() {
        return this.firstName;
    }
    public Employee setFirstName(String name) {
        this.firstName = name;
        return this;
    }

    private String lastName;
    public String getLastName() {
        return this.lastName;
    }
    public Employee setLastName(String name) {
        this.lastName = name;
        return this;
    }

    private String empId;
    public String getEmpId() {
        return this.empId;
    }
    public Employee setEmpId(String id) {
        this.empId = id;
        return this;
    }

    private String active;
    public String getActive() { return this.active; }
    public Employee setEmpStatus(String active) {
        this.active = active;
        return this;
    }

    private String role;
    public String getRole() { return this.role; }
    public Employee setRole(String role){
        this.role = role;
        return this;
    }

    private String manager;
    public String getManager() { return this.manager; }
    public Employee setManager(String manager){
        this.manager = manager;
        return this;
    }

    private String password;
    public String getPassword() { return this.password; }
    public Employee setPassword(String password) {
        this.password = password;
        return this;
    }

    public Employee() {
        this.recordId = "";
        this.firstName = "";
        this.lastName = "";
        this.empId = "";
        this.active = "inactive";
        this.role = "";
        this.manager = "";
        this.password = "";
    }

    public Employee(EmployeeEntity employeeEntity) {
        this.recordId = employeeEntity.getRecordId();
        this.firstName = employeeEntity.getFirstName();
        this.lastName = employeeEntity.getLastName();
        this.empId = employeeEntity.getEmpID();
        this.active = employeeEntity.getActive();
        this.role = employeeEntity.getRole();
        this.manager = employeeEntity.getManager();
        this.password = employeeEntity.getPassword();
    }
}
