package oop.List;


import java.util.List;

public interface EmployeesInterface {

    String addEmployee(Employees employee);
    String removeEmployeeByName(String name);
    String removeEmployee(Employees employee);
    Employees searchEmployeeByName(String name);
    List<Employees> sortByName(String ascDesc);
    List<Employees> sortBySalary(int salary, String ascDesc);

    List<Employees> getAllEmployees();



}
