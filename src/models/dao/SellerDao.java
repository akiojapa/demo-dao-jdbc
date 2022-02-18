package models.dao;

import java.util.List;

import models.entities.Department;
import models.entities.Seller;


public interface SellerDao {

	void insert(Seller obj);
	void upadte(Seller obj);
	void deletByI(Integer id);
	Seller findById(Integer id);
	List<Seller> findAll();
	List<Seller> findByDepartment(Department department);
	
}
