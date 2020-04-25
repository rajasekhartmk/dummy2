package com.employeedetails.model.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employeedetails.model.entities.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{
	public List<Employee> findAll();
	
}
