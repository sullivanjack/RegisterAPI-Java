package edu.uark.models.api;

import java.time.LocalDateTime;
import java.util.UUID;

import edu.uark.models.entities.EmployeeEntity;

public class Employee {
    private UUID id;
    public UUID getId() {
        return this.id;
    }
    public Employee setId(UUID id) {
        this.id = id;
        return this;
    }

    private String lookupCode;
    public String getLookupCode() {
        return this.lookupCode;
    }
    public Employee setLookupCode(String lookupCode) {
        this.lookupCode = lookupCode;
        return this;
    }

    private int count;
    public int getCount() {
        return this.count;
    }
    public Employee setCount(int count) {
        this.count = count;
        return this;
    }

    private LocalDateTime createdOn;
    public LocalDateTime getCreatedOn() {
        return this.createdOn;
    }
    public Employee setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    public Employee() {
        this.count = -1;
        this.lookupCode = "";
        this.id = new UUID(0, 0);
        this.createdOn = LocalDateTime.now();
    }

    public Employee(EmployeeEntity employeeEntity) {
        this.id = employeeEntity.getId();
        this.count = employeeEntity.getCount();
        this.createdOn = employeeEntity.getCreatedOn();
        this.lookupCode = employeeEntity.getLookupCode();
    }
}
