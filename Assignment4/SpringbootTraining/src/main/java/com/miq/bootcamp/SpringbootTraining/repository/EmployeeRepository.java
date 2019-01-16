package com.miq.bootcamp.SpringbootTraining.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.miq.bootcamp.SpringbootTraining.model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	public Optional<Employee> findByEmail(String email);
		
}
