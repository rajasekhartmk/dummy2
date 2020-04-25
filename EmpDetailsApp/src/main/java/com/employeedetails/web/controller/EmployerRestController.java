package com.employeedetails.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeedetails.model.entities.Employer;
import com.employeedetails.model.service.EmployerService;
@RestController
@RequestMapping("/api")
public class EmployerRestController {
	@Autowired
	private EmployerService employerService;
	@GetMapping(path="/employers",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Employer>> getAllEmployees()
	{
		return new ResponseEntity<List<Employer>>(employerService.findAll(),HttpStatus.FOUND);
	}
	@GetMapping(path="/employers/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Employer> getEmployeeById(@PathVariable(name="id")Long id)
	{
		return new ResponseEntity<Employer>(employerService.findByIdEmployer(id),HttpStatus.FOUND);
	}
}
