package edu.uark.controllers;

import java.util.Lists;
import java.util.UUID;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import edu.uark.commands.employee.EmployeeLogin;
import edu.uark.commands.products.ProductByLookupCodeQuery;
import edu.uark.models.api.Employee;
import edu.uark.models.api.Product;

import edu.uark.commands.employee.EmployeesQuery;

@RestController
@RequestMapping(value = "/api/employee")
public class EmployeeRestController {

	//added by sean waters to be used for login screen query
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Employee> getEmployees() {
		return (new EmployeesQuery()).execute();
	}

	//added by sean waters on 3/1/18 for login screen
	/*@RequestMapping(value = "/byEmployeeCount/{employeeCount}", method = RequestMethod.GET)
	public Employee getEmployeeCount(@PathVariable String employeeCount) {
		return (new EmployeeCountQuery()).
			setEmployeeCount(employeeCount).
			execute();
	}*/

	@RequestMapping(value = "/byRecordId/{employeeResponseBody}", method = RequestMethod.GET)
	public Employee employeeLoginCommand (@RequestBody Employee employeeResponseBody) {
		return (new EmployeeLogin()).setEmp(employeeResponseBody).execute();
	}
	
	@ResponseBody
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test() {
		System.out.println("test homie g");
		Employee e = new Employee();
		e.setRecordId("recordid1");
		e.setEmpId("1000");
		e.setPassword("dog");
		
		Employee k = (new EmployeeLogin()).setEmp(e).execute();
		
		return k.getFirstName() + " " + k.getLastName() + " " + k.getLastName();
	}
	
	
	
}