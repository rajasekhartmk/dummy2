package com.employeedetails.web.controller;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.employeedetails.model.entities.Employee;
import com.employeedetails.model.service.EmployeeService;
@RestController
@RequestMapping("/api")
public class EmployeeRestController {
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping(path="/employees",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Employee>> getAllEmployees()
	{
		return new ResponseEntity<List<Employee>>(employeeService.findAll(),HttpStatus.OK);
	}
	
	@GetMapping(path="/employees/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Employee> getEmployeeById(@PathVariable(name="id")Long id)
	{
		return new ResponseEntity<Employee>(employeeService.findByEmpId(id),HttpStatus.FOUND);
	}
	@GetMapping(path="/employees/limit/{salary}",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Employee>> getBySalaryLimit(@PathVariable(name="salary")double salary){
		return new ResponseEntity<List<Employee>>(employeeService.salaryLimit(salary),HttpStatus.OK);
	}
}
