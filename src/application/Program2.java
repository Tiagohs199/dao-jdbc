package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		

		System.out.println("=====Test 1: Department findBy ID ======\n");
		Department dep = departmentDao.findById(3);
		System.out.println(dep);

		

		System.out.println("\n=======Teste 2 Department find all ======\n");

		List<Department> list1 = departmentDao.findAll();

		for (Department obj : list1) {
			System.out.println(obj);
		}

		System.out.println("\n=======Teste 3: Insert new id ======\n");
		Department newDep = new Department(0,"newDep");

		departmentDao.insert(newDep);
		System.out.println("Inserted new id = "+ newDep.getId());
		
		
		System.out.println("\n=======Teste 5: Department Update  ======\n");
		dep = departmentDao.findById(3);
		dep.setName("teste");
		departmentDao.update(dep);
		
		
		
		System.out.println("\n=======Teste 6: Department Delete ======\n");
		System.out.println("Enter id for delete: ");
		int id = sc.nextInt();
		
		departmentDao.deleteById(id);
		
		sc.close();

	}
}
