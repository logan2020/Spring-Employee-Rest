package com.verizon.employee.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.verizon.employee.entities.Employee;
import com.verizon.employee.services.EmployeeServices;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeServices employeeServices;

	@GetMapping(path="/")
	public String welcome() {
		return "Welcome to our app";
		
	}
	
	@GetMapping(path="/retriveAllEmployees")
	public List<Employee> retriveAll(){
		List employeeList = new ArrayList();
		employeeList= this.employeeServices.getAllEmployees();
		return employeeList;
		
	}
	
	@PostMapping(path="/addEmployee")
	public ResponseEntity addEmployee(@RequestBody Employee employee) {
		this.employeeServices.addEmployee(employee);
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		
	}
	
	@PutMapping(path="/updateEmployee")
	public ResponseEntity< HttpStatus> updateEmployee(@RequestBody Employee employee){
		return this.employeeServices.updateEmployee(employee);
	}
	
	@PostMapping(path="/deleteEmployee")
	public ResponseEntity<HttpStatus> deleteEmployee(@RequestParam String employeeId){
		return this.employeeServices.deleteEmployee(employeeId);
	}
	
}
