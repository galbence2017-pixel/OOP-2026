package oop.labor04.lab4_2;

public class Customer {
    private String firstName;
    private String lastName;
    BankAccount account;

    public Customer(BankAccount account) {
        this.account = account;
    }

    public Customer(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public BankAccount getAccount() {
        return account;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void closeAcount(){
        this.account=null;
    }

    @Override
    public String toString() {
        return "Costumer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", account=" + account +
                '}';
    }
}
