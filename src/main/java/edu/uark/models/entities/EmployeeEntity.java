package edu.uark.models.entities;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;

import edu.uark.dataaccess.entities.BaseEntity;
import edu.uark.dataaccess.repository.DatabaseTable;
import edu.uark.models.api.Employee;
import edu.uark.models.entities.fieldnames.EmployeeFieldNames;

public class EmployeeEntity extends BaseEntity<EmployeeEntity> {
    @Override
    protected void fillFromRecord(ResultSet rs) throws SQLException {
        this.firstName = rs.getString(EmployeeFieldNames.FIRSTNAME);
        this.lastName = rs.getString(EmployeeFieldNames.LASTNAME);
        this.empID = rs.getInt(EmployeeFieldNames.EMP_ID);
        this.active = rs.getString(EmployeeFieldNames.ACTIVE);
        this.role = rs.getString(EmployeeFieldNames.ROLE);
        this.manager = rs.getString(EmployeeFieldNames.MANAGER);
        this.password = rs.getString(EmployeeFieldNames.PASSWORD);
    }

    @Override
    protected Map<String, Object> fillRecord(Map<String, Object> record) {
        record.put(EmployeeFieldNames.FIRSTNAME, this.firstName);
        record.put(EmployeeFieldNames.LASTNAME, this.lastName);
        record.put(EmployeeFieldNames.EMP_ID, this.empID);
        record.put(EmployeeFieldNames.ACTIVE, this.active);
        record.put(EmployeeFieldNames.ROLE, this.role);
        record.put(EmployeeFieldNames.MANAGER, this.manager);
        record.put(EmployeeFieldNames.PASSWORD, this.password);

        return record;
    }

    /* Not needed. 
    private UUID recordId;
    public UUID getRecordId() {
        return this.recordId;
    }
    
    public EmployeeEntity setRecordId(UUID recordId) {
        if (this.recordId != recordId) {
            this.recordId = recordId;
            this.propertyChanged(EmployeeFieldNames.RECORD_ID);
        }

        return this;
    }
    */
    
    
    private String firstName;
    public String getFirstName() {
        return this.firstName;
    }
    public EmployeeEntity setFirstName(String firstName) {
        if (!StringUtils.equals(this.firstName, firstName)) {
            this.firstName = firstName;
            this.propertyChanged(EmployeeFieldNames.FIRSTNAME);
        }

        return this;
    }

    private String lastName;
    public String getLastName() {
        return this.lastName;
    }
    public EmployeeEntity setLastName(String lastName) {
        if (!StringUtils.equals(this.lastName, lastName)) {
            this.lastName = lastName;
            this.propertyChanged(EmployeeFieldNames.LASTNAME);
        }

        return this;
    }

    private int empID;
    public int getEmpID() {
        return this.empID;
    }
    public EmployeeEntity setEmpID(int empID) {
        if (this.empID != empID) {
            this.empID = empID;
            this.propertyChanged(EmployeeFieldNames.EMP_ID);
        }

        return this;
    }

    private String active;
    public String getActive() {
        return this.lastName;
    }
    public EmployeeEntity setActive(String active) {
        if (this.active != active) {
            this.active = active;
            this.propertyChanged(EmployeeFieldNames.ACTIVE);
        }

        return this;
    }

    private String role;
    public String getRole() {
        return this.role;
    }
    public EmployeeEntity setRole (String role) {
        if (!StringUtils.equals(this.role, role)) {
            this.role = role;
            this.propertyChanged(EmployeeFieldNames.ROLE);
        }

        return this;
    }

    private String manager;
    public String getManager() {
        return this.manager;
    }
    public EmployeeEntity setManager (String manager) {
        if (!StringUtils.equals(this.manager, manager)) {
            this.manager = manager;
            this.propertyChanged(EmployeeFieldNames.MANAGER);
        }

        return this;
    }

    private String password;
    public String getPassword() {
        return this.password;
    }
    public EmployeeEntity setPassword (String password) {
        if (!StringUtils.equals(this.password, password)) {
            this.password = password;
            this.propertyChanged(EmployeeFieldNames.PASSWORD);
        }

        return this;
    }

    public Employee synchronize(Employee apiEmployee) {
    	
    	// This could need to be added, I'm not sure
    	// this.setCount(apiEmployee.);
        // this.setLookupCode(apiEmployee.getLookupCode());
        this.setFirstName(apiEmployee.getFirstName());
        this.setLastName(apiEmployee.getLastName());
        this.setManager(apiEmployee.getManager());      
        this.setRole(apiEmployee.getRole());
        this.setActive(apiEmployee.getActive());
        this.setPassword(apiEmployee.getPassword());
        this.setEmpID(apiEmployee.getEmpId());
        
        // Same thing here, could need this to be modified, not sure tho
        apiEmployee.setRecordId(this.getId());
        //apiEmployee.setCreatedOn(this.getCreatedOn()); -- TODO PROBABLY ADD THIS

        return apiEmployee;
    }

    public EmployeeEntity() {
        super(DatabaseTable.EMPLOYEE);

        this.firstName = StringUtils.EMPTY;
        this.lastName = StringUtils.EMPTY;
        this.empID = 0;
        this.active = StringUtils.EMPTY;
        this.role = StringUtils.EMPTY;
        this.manager = StringUtils.EMPTY;
        this.password = StringUtils.EMPTY;
    }

    public EmployeeEntity(Employee apiEmployee) {
        super(DatabaseTable.EMPLOYEE);
        this.firstName = apiEmployee.getFirstName();
        this.lastName = apiEmployee.getLastName();
        this.empID = apiEmployee.getEmpId();
        this.active = apiEmployee.getActive();
        this.role = apiEmployee.getRole();
        this.manager = apiEmployee.getManager();
        this.password = apiEmployee.getPassword();
    }
}
