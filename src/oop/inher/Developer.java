package oop.inher;

import java.time.LocalDate;

public class Developer extends Employee {
    enum Language{
        JAVA,
        PHP,
        C,
        PYTHON,
        JS,
        SWIFT
    }
    private Language language;

    public Developer(String name, double salary, LocalDate hireDate,Language language,double performanceRating) {
        super(name, salary, hireDate,performanceRating);
        this.language = language;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public double getBonus() {
        return getSalary() * 0.1; // 10% bonus for developers
    }
}
