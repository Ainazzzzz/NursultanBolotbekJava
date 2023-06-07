package oop.inher;

import java.time.LocalDate;

public abstract class Employee {
    private String name;
    private int id;
    private static int idd;
    private double salary;
    private LocalDate hireDate;
    private double performanceRating;

    public Employee(String name, double salary, LocalDate hireDate,double performanceRating) {
        this.name = name;
        this.id = idd++;
        this.salary = salary;
        this.hireDate = hireDate;
        this.performanceRating=performanceRating;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract double getBonus();

    public double getPerformanceRating() {
        return performanceRating;
    }

    public void setPerformanceRating(double performanceRating) {
        this.performanceRating = performanceRating;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", hireDate=" + hireDate +
                ", performanceRating=" + performanceRating +
                '}';
    }
}
