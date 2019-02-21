package com.verizon.employee.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	private String employeeId;
	private String employeeName;
	private String employeeRole;
	private String employeeSystemNumber;
	
	public Employee() {
		super();
	}
	
	public Employee(String employeeId, String employeeName, String employeeRole, String employeeSystemNumber) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeRole = employeeRole;
		this.employeeSystemNumber = employeeSystemNumber;
	}
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeRole() {
		return employeeRole;
	}
	public void setEmployeeRole(String employeeRole) {
		this.employeeRole = employeeRole;
	}
	public String getEmployeeSystemNumber() {
		return employeeSystemNumber;
	}
	public void setEmployeeSystemNumber(String employeeSystemNumber) {
		this.employeeSystemNumber = employeeSystemNumber;
	}
	
}
