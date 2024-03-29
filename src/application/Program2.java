package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: insert ===");
        System.out.print("Insert new Department Name: ");
//        String newDepartmentName = sc.nextLine();
//        Department newDepartment = new Department(null, newDepartmentName);
//        departmentDao.insert(newDepartment);

        System.out.println("=== TEST 2: delete ===");
//        departmentDao.deleteById(8);
        System.out.println();

        System.out.println("=== TEST 3: findById ===");
        System.out.print("Enter the Id to find: ");
        int id = sc.nextInt();
        System.out.println(departmentDao.findById(id));

        System.out.println("=== TEST 4: findAll ===");
        System.out.println(departmentDao.findAll());

        System.out.println("=== TEST 5: update ===");
        departmentDao.update(new Department(5,"Snacks"));

    }
}
