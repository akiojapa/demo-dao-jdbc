package models.dao;

import java.util.List;

import models.entities.Department;

public interface DepartmentdDao {
	
	void insert(Department obj);
	void upadte(Department obj);
	void deletByI(Integer id);
	Department findById(Integer id);
	List<Department> findAll();
	

}
