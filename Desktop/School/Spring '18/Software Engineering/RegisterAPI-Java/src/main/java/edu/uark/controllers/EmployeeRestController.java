package edu.uark.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/employee")
public class EmployeeRestController {
	
	@ResponseBody
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test() {
		return "/api/employee/test I have no idea what I am doing part 2";
	}
	
}