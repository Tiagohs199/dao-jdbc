package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("=====Test 1: seller findBy ID ======\n");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

		System.out.println("\n======Teste 2: Department find by id ======\n");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);

		for (Seller obj : list) {
			System.out.println(obj);
		}

		System.out.println("\n=======Teste 3: Department find all ======\n");

		List<Seller> list1 = sellerDao.findAll();

		for (Seller obj : list1) {
			System.out.println(obj);
		}

		System.out.println("\n=======Teste 4: Department find all ======\n");
		Seller newSeller = new Seller(null, "Greg","greg@gamil.com",new Date(), 4000.0, department);

		sellerDao.insert(newSeller);
		System.out.println("Inserted new id = "+ newSeller.getId());
		
		
		System.out.println("\n=======Teste 4: Department find all ======\n");

		seller = sellerDao.findById(1);
		seller.setName("Martha  Waine");

		sellerDao.update(seller);
		
		System.out.println("Update completed!!");
	}

}
