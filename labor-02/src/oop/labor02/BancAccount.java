package oop.labor02;

public class BancAccount {
    private String accountNumber;
    private double balance;

    public BancAccount(String sNumber){
        accountNumber=sNumber;
    }
    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double money){
        if(money>=0){
            balance=balance+money;
        }else{
            System.out.println("You can't deposit a negative amount");
        }
    }

    public boolean withdraw(double money){
        if(balance>=money){
            balance=balance-money;
            return true;
        }
        return false;
    }
}
