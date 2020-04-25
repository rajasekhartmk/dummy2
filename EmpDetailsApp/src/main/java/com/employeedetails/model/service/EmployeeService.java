package com.employeedetails.model.service;
import java.util.List;

import com.employeedetails.model.entities.Employee;
public interface EmployeeService {
	public List<Employee> findAll();
	public List<Employee> salaryLimit(Double salary);
	public Employee findByEmpId(Long id);
	public void createemployee(Employee employee);

}
