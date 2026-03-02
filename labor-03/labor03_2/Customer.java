package oop.labor03_2;

import oop.labor03_1.BancAccount;

public class Customer {
    private String firstName;
    private String lastName;
    public static final int MAX_ACCOUNTS = 10;
    private int numAccounts;
    private BancAccount accounts[] = new BancAccount[ MAX_ACCOUNTS ];

    public void addAccounts(BancAccount accounts) {
        if(numAccounts==MAX_ACCOUNTS){
            System.out.println("You reached the max number of accounts");
        }
        for(int i=0; i<numAccounts; i++){

        }
    }

    public Customer(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

}
