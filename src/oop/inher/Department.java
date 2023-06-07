package oop.inher;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public Department(String name, List<Employee> employees) {
        this.name = name;
        this.employees = employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public String getName() {
        return name;
    }

    public void modifyEmployee(String employeeName, double newSalary) {
        List<Employee> employee1;
       Optional< Employee > employee = employees.stream().filter(employees1 -> employees1.getName().equalsIgnoreCase(employeeName)).findAny();
       if(employee.isPresent()) {
           if (newSalary > 0) {
               employee1 =  employees.stream().filter(u->u.getName().equalsIgnoreCase(employeeName)).collect(Collectors.toList());
               Employee employee2=employee1.get(0);
               employee2.setSalary(newSalary);
               System.out.println(employee2);
           } else {
               System.exit(0);
           }
       }


    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", employees=" + employees +
                '}';
    }
}
