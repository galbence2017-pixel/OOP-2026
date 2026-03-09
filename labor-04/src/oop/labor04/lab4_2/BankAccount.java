package oop.labor04.lab4_2;

public class BankAccount {
    private String accountnumber;
    private double balance;

    public BankAccount(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public void deposit(double amount){
        if(amount>=0){
            balance=balance+amount;
        }else{
            System.out.println("You can't deposit a negative amount");
        }
    }

    public boolean withdraw(double amount){
        if(balance>=amount){
            balance=balance-amount;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "BancAccount{" +
                "accountnumber='" + accountnumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
