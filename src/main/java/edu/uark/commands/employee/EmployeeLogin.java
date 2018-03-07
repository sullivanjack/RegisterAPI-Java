package edu.uark.commands.employee;

import edu.uark.commands.ResultCommandInterface;
import edu.uark.controllers.exceptions.ConflictException;
import edu.uark.controllers.exceptions.UnprocessableEntityException;
import edu.uark.models.api.Employee;
import edu.uark.models.entities.EmployeeEntity;
import edu.uark.models.repositories.EmployeeRepository;
import edu.uark.models.repositories.interfaces.EmployeeRepositoryInterface;

public class EmployeeLogin implements ResultCommandInterface<Employee> {

	@Override
	public Employee execute() {
		if (this.emp == null) {
			throw new UnprocessableEntityException("Employee is null");
		}
		
		EmployeeEntity employeeEntity = this.employeeRepository.byEmployeeID(emp.getEmpId());
		
		if (employeeEntity == null) {
			System.out.println("Employee Entity is null RIP");
			throw new ConflictException("Employee entity is null");
			
		}
		
		System.out.println(employeeEntity.getFirstName() + " " + employeeEntity.getEmpID() + " " + employeeEntity.getPassword());
		System.out.println(emp.getFirstName() + " " + emp.getEmpId() + " " + emp.getPassword());
				
		
		if (employeeEntity.getEmpID() == emp.getEmpId() && employeeEntity.getPassword() == emp.getPassword()) {
			return new Employee(employeeEntity);
		} else {
			return new Employee().setFirstName("It didn't work");
		}

	}
	
	
	//Properties	
	private Employee emp;
	public Employee getEmp() {
		return this.emp;
	}
	
	public EmployeeLogin setEmp(Employee employeeFromClient) {
		this.emp = employeeFromClient;
		return this;
	}
	
	
	
	private EmployeeRepositoryInterface employeeRepository;
	public EmployeeRepositoryInterface getEmployeeRepository() {
		return this.employeeRepository;
	}
	public EmployeeLogin setProductRepository(EmployeeRepositoryInterface employeeRepository) {
		this.employeeRepository = employeeRepository;
		return this;
	}
	
	public EmployeeLogin() {
		this.employeeRepository = new EmployeeRepository();
	}

}
