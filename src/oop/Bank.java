package oop;


import java.util.Arrays;
import java.util.Scanner;

public class Bank {
    private String bankName;
    private String location;
    private Users[] users;

    public Bank(String bankName, String location, Users [] users) {
        this.bankName = bankName;
        this.location = location;
        this.users = users;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Users[] getUsers() {
        return users;
    }

    public void setUsers(Users[] users) {
        this.users = users;
    }

    public Users[] add() {
        Scanner sc = new Scanner(System.in);
        Users user = new Users(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt());
        Users[] users1=Arrays.copyOf(users,users.length+1);
        users1[users1.length-1]=user;
        users=Arrays.copyOf(users1,users1.length);
        return users;

    }

    public Users[] removeByName(String name) {
        int size= users.length;
        Users[] newOne=new Users[size];
        for (int i=0; i<newOne.length-1; i++) {
            if (name.equalsIgnoreCase(users[i].getName())) {
                newOne[i] = users[i + 1];
                System.out.println("---------"+i);
                System.out.println(newOne[i]);
            } else {
                newOne[i] = users[i];
                System.out.println("---------"+i);
                System.out.println(newOne[i]);
            }
        }

        users=Arrays.copyOf(newOne,newOne.length-1);

        return users;
     }


    public void printInfo() {
        System.out.println("Bank name: " + bankName);
        System.out.println("Location: " + location);
        System.out.println("Number of accounts: " + users.length);
        for (Users account : users) {
                System.out.println("Account holder name: " + account.getName());
                System.out.println("Account number: " + account.getNumber());
                System.out.println("Balance: " + account.getBalance());
            }

        }
    }

