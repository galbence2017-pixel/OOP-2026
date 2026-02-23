package oop.labor02;

import java.awt.*;
import java.lang.classfile.constantpool.LongEntry;
import java.sql.SQLOutput;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello, Lab_02");
//        BancAccount account1 = new BancAccount("BT1");
//        System.out.println(account1.getAccountNumber()+ ": " + account1.getBalance());
//        account1 .deposit(1000);
//        System.out.println(account1.getAccountNumber()+ ": " + account1.getBalance());
//        boolean result = account1.withdraw(500);
//        if ( !result ){
//            System.out.println("You do not have sufficient funds for this operation!");
//        }
//        System.out.println(account1.getAccountNumber()+ ": " + account1.getBalance());
//        account1.withdraw(1000);
//        System.out.println(account1.getAccountNumber()+ ": " + account1.getBalance());
//        BancAccount account2= new BancAccount("BT2");
//        System.out.println(account2.getAccountNumber()+ ": " + account2.getBalance());
//        account2.deposit(2000);
//        System.out.println(account2.getAccountNumber()+ ": " + account2.getBalance());

        Rectangle[] rectangles=new Rectangle[10];
        Random rand=new Random();

        double totalArea=0;
        for(int i=0; i< rectangles.length; i++){
            double length=1+rand.nextInt(10);
            double width=1+ rand.nextInt(10);
            rectangles[i]=new Rectangle(length, width);
            System.out.println(rectangles[i].getLength()+", "+rectangles[i].getWidth()+", "+rectangles[i].perimeter()+", "+rectangles[i].area());
            totalArea+=rectangles[i].area();
        }
        System.out.println("The total Area is: "+totalArea);


    }
}

