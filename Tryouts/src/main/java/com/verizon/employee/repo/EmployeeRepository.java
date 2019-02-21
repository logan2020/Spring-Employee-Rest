package com.verizon.employee.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.verizon.employee.entities.Employee;

@Repository
@Transactional
public interface EmployeeRepository extends JpaRepository<Employee, String>{
	
}
