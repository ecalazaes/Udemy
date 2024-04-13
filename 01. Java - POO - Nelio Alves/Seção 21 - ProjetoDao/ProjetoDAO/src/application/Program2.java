package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("\n=== TEST 1: Department Insert ===");
        Department newDep = new Department(null, "Games");
        departmentDao.insert(newDep);
        System.out.println("Inserted! New id = " + newDep.getId());

        System.out.println("\n=== TEST 2: Department Update ===");
        Department dep = departmentDao.findById(1);
        dep.setName("League");
        departmentDao.update(dep);
        System.out.println("Update Complete");

        System.out.println("=== TEST 3: Department findById ===");
        dep = departmentDao.findById(5);
        System.out.println(dep);

        System.out.println("\n=== TEST 4: Department findAll ===");
        List<Department> list = departmentDao.findAll();
        for (Department obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n=== TEST 5: Department Delete ===");
        System.out.print("Entre com id para teste de deleção: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completed");

        sc.close();
    }
}
