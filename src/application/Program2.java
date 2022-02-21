package application;


import java.util.List;
import java.util.Scanner;

import models.dao.DaoFactory;
import models.dao.DepartmentDao;
import models.entities.Department;



public class Program2 {

	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("==== TEST 1: findById ====");
		Department dep = departmentDao.findById(4);
		System.out.println(dep);
		
		System.out.println("\n==== TEST 2: FindAll ====");
		List<Department> list = departmentDao.findAll();
		for(Department obj: list) {
			System.out.println(obj);
		
		}
		
	/*	System.out.println("\n==== TEST 3: Department Insert ====");
		Department newDepartment = new Department(null, "Tvs");
		departmentDao.insert(newDepartment);
		System.out.println("\n ===== Department inserted ====");
		System.out.println("Inserted! New ID: " + newDepartment.getId());
		*/
		
		System.out.println("\n==== TEST 4: Department Update ====");
		dep = departmentDao.findById(3);
		dep.setName("Food");
		departmentDao.update(dep);
		System.out.println("Updated! ");
		
		System.out.println("\n ==== TEST 5: Department Deleted ====");
		System.out.println("Enteder delete for Delete: ");
		int id = sc.nextInt();
		departmentDao.deletById(id);
		System.out.println("Delete completed");
		
	
	
		
		
	}
}
