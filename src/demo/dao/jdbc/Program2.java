package demo.dao.jdbc;

import java.util.List;
import java.util.Scanner;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
        System.out.println("===== TEST 1 : Department findById =====");
        Department department = departmentDao.findById(1);
        System.out.println(department);
        
        System.out.println("\n===== TEST 2 : Department findAll =====");
        List<Department> list = departmentDao.findAll();
            for (Department dep : list) {
            System.out.println(dep);
	}
            
        System.out.println("\n===== TEST 3 : Department insert =====");
        Department newDepartment = new Department(null, "Food");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted: New ID = " + newDepartment.getId());
        
        System.out.println("\n===== TEST 4 : Department update =====");
        department = departmentDao.findById(1);
        department.setName("Comunication");
        departmentDao.update(department);
        System.out.println("Updated completed");
        
        System.out.println("\n===== TEST 5 : Department delete =====");
        System.out.print("Enter ID for delete test: ");
        int id = sc.nextInt();
        departmentDao.delete(id);
        System.out.println("Deleted completed");
        
        sc.close();
    }
}
