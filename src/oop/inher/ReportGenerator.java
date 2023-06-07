package oop.inher;


import java.util.List;

public interface ReportGenerator{
    List<?> generateEmployeeList();
    void generateReport();
    double calculateSalary(int id);
    void generateAnnualPerformanceReview();
}
