package demo.dao.jdbc;

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
        System.out.println("===== TEST 1 : Seller findById =====");
        Seller seller = sellerDao.findById(7);
        System.out.println(seller);
        
        System.out.println("\n===== TEST 2 : Seller findByDpartment =====");
        Department department = new Department(1, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj : list) {
            System.out.println(obj);
        }
        
        System.out.println("\n===== TEST 3 : Seller findAll =====");
        list = sellerDao.findAll();
        for (Seller obj : list) {
            System.out.println(obj);
        }
        
        /*System.out.println("\n===== TEST 4 : Seller insert =====");
        Seller newSeller = new Seller(null, "Higor", "higor@gmail.com", new Date(), 3870.0, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted: New ID = " + newSeller.getId());*/
        
        System.out.println("\n===== TEST 5 : Seller update =====");
        seller = sellerDao.findById(14);
        seller.setId(8);
        sellerDao.update(seller);
        System.out.println("Updated completed");
        
        /*System.out.println("\n===== TEST 6 : Seller delete =====");
        System.out.print("Enter ID for delete test: ");
        int id = sc.nextInt();
        sellerDao.delete(id);
        System.out.println("Deleted completed");*/
    }  
}
