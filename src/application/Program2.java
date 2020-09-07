package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		

		System.out.println("\n=======Teste 4: Insert new id Department ======\n");
		Department dep = new Department(5,"Jogos");

		departmentDao.insert(dep);
		System.out.println("Inserted new id = "+ dep.getId());
		
		System.out.println("\n=======Teste 5: Department Update  ======\n");
		dep = sellerDao.findById(1);
		seller.setName("Martha  Waine");

		sellerDao.update(seller);
		System.out.println("Update completed!!");
		
		
		
	}

}
