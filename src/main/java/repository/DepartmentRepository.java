package repository;

import org.springframework.data.repository.CrudRepository;

import model.Departments;

public interface DepartmentRepository extends CrudRepository<Departments, Integer> {
	
}
