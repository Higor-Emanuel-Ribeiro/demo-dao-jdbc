package demo.dao.jdbc;

import java.util.Date;
import model.entities.Department;
import model.entities.Seller;

public class Program {

    public static void main(String[] args) {
        
        Department department = new Department(01, "MSW");
        Seller sl = new Seller(20, "Higor", "higor@gmail.com", new Date(), 2000.0, department);
        
        System.out.println(sl);
    }  
}
