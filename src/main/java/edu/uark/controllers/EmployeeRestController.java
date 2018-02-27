package edu.uark.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import edu.uark.commands.employee.EmployeeLogin;
import edu.uark.commands.products.ProductByLookupCodeQuery;
import edu.uark.models.api.Employee;
import edu.uark.models.api.Product;

@RestController
@RequestMapping(value = "/api/employee")
public class EmployeeRestController {
	
	@RequestMapping(value = "/byRecordId/{employeeResponseBody}", method = RequestMethod.GET)
	public Employee employeeLoginCommand (@RequestBody Employee employeeResponseBody) {
		return (new EmployeeLogin()).setEmp(employeeResponseBody).execute();
	}
	
	@ResponseBody
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test() {
		return "/api/employee/test I have no idea what I am doing still, like still";
	}
	
	
	
}