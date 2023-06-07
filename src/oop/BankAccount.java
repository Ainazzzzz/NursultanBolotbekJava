package oop;

public class BankAccount {
    private int number;
    private int balance;
    private String user;

    public BankAccount(int number, int balance, String user) {
        this.number = number;
        this.balance = balance;
        this.user = user;
    }

    public BankAccount(int number,String user) {
        this.number = number;
        this.user=user;
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

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    public int deposit(int dep){
        balance+=dep;
        return balance;
    }

    public String withdrawal(int w) {
        if (w <= balance) {
            balance -= w;
            return "successful " + "and your balance is " + balance;
        }
        return "fail";
    }


    public String info() {
        return "number=" + number +
                ", balance=" + balance +
                ", user='" + user + '\'';
    }
}
