package oop.inher;

import java.time.LocalDate;
import java.util.Date;

public class Manager extends Employee {
    private boolean goodWorker;

    public Manager(String name, double salary, LocalDate hireDate,double performanceRating, boolean goodWorker) {
        super(name, salary, hireDate,performanceRating);
        this.goodWorker=goodWorker;
    }

    public boolean isGoodWorker() {
        return goodWorker;
    }

    public void setGoodWorker(boolean goodWorker) {
        this.goodWorker = goodWorker;
    }

    public double getBonus() {
        return getSalary() * 0.2; // 20% bonus for managers
    }

}
