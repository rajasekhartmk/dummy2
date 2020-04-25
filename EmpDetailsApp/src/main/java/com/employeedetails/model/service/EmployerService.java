package com.employeedetails.model.service;

import java.util.List;

import com.employeedetails.model.entities.Employer;

public interface EmployerService {
	public List<Employer> findAll();
	public Employer findByIdEmployer(Long id);
}
