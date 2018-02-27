package edu.uark.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import edu.uark.commands.products.ProductByLookupCodeQuery;
import edu.uark.commands.products.ProductCreateCommand;
import edu.uark.commands.products.ProductDeleteCommand;
import edu.uark.commands.products.ProductQuery;
import edu.uark.commands.products.ProductUpdateCommand;
import edu.uark.commands.products.ProductsQuery;
import edu.uark.models.api.Employee;
import edu.uark.models.api.Product;

@RestController
@RequestMapping(value = "/api/employee")
public class EmployeeRestController {
	

	
	@RequestMapping(value = "/{productId}", method = RequestMethod.PUT)
	public Product updateProduct(@PathVariable UUID productId, @RequestBody Product product) {
		return (new ProductUpdateCommand()).
			setProductId(productId).
			setApiProduct(product).
			execute();
	}
	
	
	@ResponseBody
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test() {
		return "/api/employee/test I have no idea what I am doing still, like still";
	}
	
	
	
}