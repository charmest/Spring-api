package com.charmest.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.charmest.api.model.Employee;

// Annotation qui indique que la classe est un Bean, et que son rôle est de communiquer avec une source de données
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>  {
	
}
