package com.verizon.employee.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.verizon.employee.entities.Employee;
import com.verizon.employee.repo.EmployeeRepository;
@Service
public class EmployeeServices {

	@Autowired
	private EmployeeRepository employeeRepo;
	
	public List<Employee> getAllEmployees(){
		return this.employeeRepo.findAll();
		
	}

	public void addEmployee(Employee employee) {
		System.out.println(this.employeeRepo.save(employee));
		
	}

	public ResponseEntity<HttpStatus> updateEmployee(Employee employee) {
		Employee sucess = this.employeeRepo.save(employee);
		return new ResponseEntity(sucess,HttpStatus.OK);
	}

	public ResponseEntity<HttpStatus> deleteEmployee(String employeeId) {
		this.employeeRepo.deleteById(employeeId);
		return new ResponseEntity(HttpStatus.OK);
	}
}
