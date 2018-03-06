/*package edu.uark.commands.employee;

//created by sean waters on 3/1/18

import org.apache.commons.lang3.StringUtils;

import edu.uark.commands.ResultCommandInterface;
import edu.uark.controllers.exceptions.NotFoundException;
import edu.uark.controllers.exceptions.UnprocessableEntityException;
import edu.uark.models.api.Employee;
import edu.uark.models.entities.EmployeeEntity;
import edu.uark.models.repositories.EmployeeRepository;
import edu.uark.models.repositories.interfaces.EmployeeRepositoryInterface;

public class EmployeeCountQuery implements ResultCommandInterface<Employee> {
	@Override
	public Employee execute() {
		if (StringUtils.isBlank(this.employeeCount)) {
			throw new UnprocessableEntityException("employeeCount");
		}
		
		EmployeeEntity employeeEntity = this.employeeRepository.byRecordId(this.employeeCount);
		if (employeeEntity != null) {
			return new Employee(employeeEntity);
		} else {
			throw new NotFoundException("Employee");
		}
	}

	//Properties
	private int employeeCount;
	public int getLookupCode() {
		return this.employeeCount;
	}
	
	
	public EmployeeCountQuery setLookupCode(int employeeCount) {
		this.employeeCount = employeeCount;
		return this;
	}
	
	private EmployeeRepositoryInterface employeeRepository;
	public EmployeeRepositoryInterface getEmployeeRepository() {
		return this.employeeRepository;
	}
	public EmployeeCountQuery setEmployeeRepository(EmployeeRepositoryInterface employeeRepository) {
		this.employeeRepository = employeeRepository;
		return this;
	}
	
	public EmployeeCountQuery() {
		this.employeeRepository = new EmployeeRepository();
	}
}
*/