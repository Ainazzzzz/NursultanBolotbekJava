package oop.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class EmployeeService implements EmployeesInterface {
    private List<Employees> employees;


    public EmployeeService(List<Employees> employees) {
        this.employees = employees;
    }

    @Override
    public String addEmployee(Employees employee) {
        boolean exist= employees.stream().anyMatch(x->x.equals(employee));
        if(exist){
            return "Already exists!";
        }else {
            employees.add(employee);
            System.out.println(employees);
        }

        return "Successfully added!";
    }

    @Override
    public String removeEmployeeByName(String name) {
        boolean exists= employees.stream().anyMatch(x->x.getName().equalsIgnoreCase(name));
        if(exists) {
            for (Employees e : employees) {
                if (e.getName().equalsIgnoreCase(name)) {
                    employees.remove(e);
                    return "Successfully deleted!";
                }
            }
        }
        return "There is no employee with such a name!";
    }

    @Override
    public String removeEmployee(Employees employee) {
        for (Employees e : employees) {
            if (e.equals(employee)) {
                employees.remove(e);
                return "Successfully deleted!";
            }
        }
        return "There is no such an employee!";
    }

    @Override
    public Employees searchEmployeeByName(String name) {
        for (Employees e: employees) {
            if(e.getName().equalsIgnoreCase(name)){
               return e;
            }
        }
    return null;}

    @Override
    public List<Employees> sortByName(String ascDesc) {
        Comparator<Employees> comparator = new Comparator<Employees>() {
            @Override
            public int compare(Employees o1, Employees o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        Comparator<Employees> comparator1 = new Comparator<Employees>() {
            @Override
            public int compare(Employees o1, Employees o2) {
                return o2.getName().compareTo(o1.getName());
            }
        };
        if(ascDesc.equalsIgnoreCase("asc")){
            employees.sort(comparator);
            return employees;
        }else if(ascDesc.equalsIgnoreCase("desc")){
            employees.sort(comparator1);
            return employees;
        }

        return employees;
    }

    @Override
    public List<Employees> sortBySalary(int salary, String ascDesc) {
        if(ascDesc.equalsIgnoreCase("asc")){
            List<Employees> employees1 = new ArrayList<>(employees.stream().filter(x -> x.getSalary() > salary).toList());
            Collections.sort(employees1,Comparator.comparingInt(Employees::getSalary));
            return employees1;
        }else if(ascDesc.equalsIgnoreCase("desc")){
            List<Employees> employees2 = new ArrayList<>(employees.stream().filter(x->x.getSalary()<salary).toList());
            Collections.sort(employees2,Comparator.comparingInt(Employees::getSalary).reversed());
            return employees2;
        }

        return null;
    }

    @Override
    public List<Employees> getAllEmployees() {
        return employees;
    }
}
