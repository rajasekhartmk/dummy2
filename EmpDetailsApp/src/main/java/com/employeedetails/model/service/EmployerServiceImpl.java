package com.employeedetails.model.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.employeedetails.exceptionhandler.EmployerNotFoundException;
import com.employeedetails.model.entities.Employer;
import com.employeedetails.model.repository.EmployerRepository;
@Service
@Transactional
public class EmployerServiceImpl implements EmployerService{
	@Autowired
	private EmployerRepository repo;

	@Override
	public List<Employer> findAll() {
		return repo.findAll();
	}
	@Override
	public Employer findByIdEmployer(Long id) {
		return repo.findById(id).orElseThrow(EmployerNotFoundException::new);
	}
}
