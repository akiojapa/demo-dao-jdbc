package applications;



import java.util.Date;

import models.dao.DaoFactory;
import models.dao.SellerDao;
import models.entities.Department;
import models.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerdao = DaoFactory.createSellerDao();
		
		System.out.println("===== TEST 1: Seller findByID ======");
		Seller seller = sellerdao.findById(3);
		
		System.out.println(seller);
		
	
	}

}
