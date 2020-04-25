package com.employeedetails.model.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.employeedetails.exceptionhandler.EmployeeNotFoundException;
import com.employeedetails.model.entities.Employee;
import com.employeedetails.model.repository.EmployeeRepository;
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeRepository repo;
	List<Employee> salaryLimit=new ArrayList<>();
	@Override
	public List<Employee> findAll() {
		return repo.findAll();
	}
	@Override
	public void createemployee(Employee employee) {
		repo.save(employee);
		}
	@Override
	public Employee findByEmpId(Long id) {
		return repo.findById(id).orElseThrow(EmployeeNotFoundException::new);
	}
	@Override
	public List<Employee> salaryLimit(Double salary) {
		for(Employee e: findAll())
			{
				if(e.getSalary()<salary){
					salaryLimit.add(e);
				}
			}
			return salaryLimit;
		}
	}
	
