package edu.uark.models.api;

import java.time.LocalDateTime;
import java.util.UUID;

import edu.uark.models.entities.EmployeeEntity;

public class Employee {
    /*record id may not be needed from database*/
    private UUID recordId;
    public UUID getRecordId() {
        return this.recordId;
    }
    public Employee setRecordId(UUID id) {
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

    private int empId;
    public int getEmpId() {
        return this.empId;
    }
    public Employee setEmpId(int id) {
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
        this.recordId = new UUID(0, 0);
        this.firstName = "";
        this.lastName = "";
        this.empId = 0;
        this.active = "inactive";
        this.role = "";
        this.manager = "";
        this.password = "";
    }

    public Employee(EmployeeEntity employeeEntity) {
        this.recordId = employeeEntity.getId();
        this.firstName = employeeEntity.getFirstName();
        this.lastName = employeeEntity.getLastName();
        this.empId = employeeEntity.getEmpID();
        this.active = employeeEntity.getActive();
        this.role = employeeEntity.getRole();
        this.manager = employeeEntity.getManager();
        this.password = employeeEntity.getPassword();
    }
}
