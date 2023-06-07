package oop.inher;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Department department = new Department("IT-DEPARTMENT", List.of(
                new Developer("Samat", 12000, LocalDate.now(), Developer.Language.C, 12),
                new Developer("Azat", 10000, LocalDate.now(), Developer.Language.PYTHON, 78),
                new Developer("Zebra", 13000, LocalDate.now(), Developer.Language.JAVA, 45)
        )
        );

        Department department1 = new Department("Managers-DEPARTMENT", List.of(
                new Manager("Aigul", 12000, LocalDate.now(), 44, true),
                new Manager("Mirgul", 10000, LocalDate.now(), 88, false),
                new Manager("Zorgul", 13000, LocalDate.now(), 99, true)
        )
        );
        Department department2 = new Department("Sales-DEPARTMENT", List.of(
                new Salesperson("Satkyn", 1200, LocalDate.now(), 12, 1.6),
                new Salesperson("Algyn", 1400, LocalDate.now(), 56, 2.1),
                new Salesperson("Osho", 1100, LocalDate.now(), 67, 2.2)
        )
        );


        List<Department> departments = List.of(department, department1, department2);
        EmployeeManagementSystem employeeManagementSystem = new EmployeeManagementSystem(departments);
        employeeManagementSystem.generateReport();
        System.out.println( employeeManagementSystem.generateEmployeeList());
        employeeManagementSystem.generateAnnualPerformanceReview();
        System.out.println( employeeManagementSystem.calculateSalary(8));
        department1.modifyEmployee("Mirgul",23000);

    }
}
