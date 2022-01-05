package org.generation.italy.repository;

import org.generation.italy.models.Departments;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<Departments, Integer> {
	
}
