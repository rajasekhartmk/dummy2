package com.employeedetails.model.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employeedetails.model.entities.Employer;
@Repository
public interface EmployerRepository extends JpaRepository<Employer, Long>{
	public List<Employer> findAll();
	
}
