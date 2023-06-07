package oop.inher;

import java.time.LocalDate;

public class Salesperson extends Employee {
    private double commissionRate;

    public Salesperson(String name, double salary, LocalDate hireDate,double performanceRating, double commissionRate) {
        super(name, salary, hireDate,performanceRating);
        this.commissionRate = commissionRate;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getBonus() {
        return getSalary() * commissionRate; // bonus based on commission rate for salespeople
    }
}

