package applications;



import java.util.Date;
import java.util.List;
import java.util.Scanner;

import models.dao.DaoFactory;
import models.dao.SellerDao;
import models.entities.Department;
import models.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("===== TEST 1: Seller findByID ======");
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		
		System.out.println("\n ===== TEST 2: Seller findByDepartment =====");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj: list){
			System.out.println(obj);
			
		}
		
		System.out.println("\n ===== TEST 3: Seller findAll =====");
		list = sellerDao.findAll();
		for (Seller obj: list){
			System.out.println(obj);
		}
		
		
		/*System.out.println("\n ===== TEST 4: Seller Insert =====");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New Id = " + newSeller.getId());
	*/	
		System.out.println("\n ===== TEST 5: Seller Update =====");
		seller = sellerDao.findById(4);
		seller.setName("Maikola Snow");
		sellerDao.update(seller);
		System.out.println("Update completed.");
		
		System.out.println("\n ===== TEST 6: Seller Delete =====");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete completed.");
		
		sc.close();
	
	}

}
