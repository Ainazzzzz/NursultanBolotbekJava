package oop.inher;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EmployeeManagementSystem implements ReportGenerator {
    private List<Department> departments;

    public EmployeeManagementSystem(List<Department> departments) {
        this.departments = departments;
    }

    public void generateReport() {
        for (Department department : departments) {
            double totalSalary = 0;
            System.out.println("Отдел: " + department.getName());
            System.out.println("Список сотрудников:");
            for (Employee employee : department.getEmployees()) {
                System.out.println("- " + employee.getName() + " - " + employee.getSalary() + " $");
                totalSalary += employee.getSalary();
            }
            System.out.println("Общая заработная плата по отделу: " + totalSalary + " $");
            System.out.println();
        }
    }



    public double calculateSalary(int id) {
         List<Employee> employee;
          for (Department d : departments) {
            Optional<Employee> optionalEmployee =  d.getEmployees().stream().filter(y->y.getId()==id).findAny();
             if(optionalEmployee.isPresent()){
                 employee = d.getEmployees().stream().filter(y->y.getId()==id).collect(Collectors.toList());
                 Employee employee1 = employee.get(0);
                 System.out.println(employee + "  calculated salary");
                 return employee1.getSalary() + employee1.getBonus();
             }
        }
        return 0;
    }

    @Override
    public List<Department> generateEmployeeList() {
        return departments;

    }


    @Override
    public void generateAnnualPerformanceReview() {
        for (Department department : departments) {
            System.out.println("Отдел: " + department.getName());
            System.out.println("Список сотрудников и их оценки производительности:");
            for (Employee employee : department.getEmployees()) {
                System.out.println("- " + employee.getName() + " - " + employee.getPerformanceRating());
            }
            System.out.println();
        }
    }
}
