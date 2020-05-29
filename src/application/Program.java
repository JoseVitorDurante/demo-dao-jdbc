package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: seller findbyId ====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		

		System.out.println("\n === TEST 2: seller findbyDepartment ====");
		Department department = new Department(3, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n === TEST 3: seller findALL ====");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		
		System.out.println("\n === TEST 4: seller insert ====");
		Seller newSeller = new Seller(null, "greg", "greg@gmail.com", new Date(), 4000.0, department); 
		sellerDao.insert(newSeller);
		System.out.println("inserted new id = " + newSeller.getId());
		
		
		System.out.println("\n === TEST 5: seller update ====");
		seller = sellerDao.findById(1);
		seller.setName("Marta Waine");
		sellerDao.upddate(seller);
		System.out.println("update completed");
		
		System.out.println("\n === TEST 5: seller update ====");
		System.out.println("enter com o id");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("delete completed");
		
		
		sc.close();
	}
}
