package oop;

public class Users {
    private String name;
    private String address;
    private String email;
    private int number;
    private int balance;

    public Users(String name, String address, String email, int number) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.number = number;
    }

    public Users(String name, String address, String email, int number, int balance) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.number = number;
        this.balance = balance;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", number=" + number +
                ", balance=" + balance +
                '}';
    }
}
