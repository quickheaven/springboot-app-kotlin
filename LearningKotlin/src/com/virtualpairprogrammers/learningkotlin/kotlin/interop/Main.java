package com.virtualpairprogrammers.learningkotlin.kotlin.interop;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Customer phil  = new Customer(null, null); id cannot be null because in Java the id is primitive long
        Customer phil = new Customer(0, null);
        CustomerDatabase db = new CustomerDatabase();
        List<Customer> customers = db.getCustomers();
        // customers.add(phil); // unsupported object exception because customers is immutable
        try {
            db.addCustomer(phil); // illegal access exception
        } catch (IllegalAccessException e) { // will no work unless in kotlin we add @Throw
            System.out.println("Caught exception ");
        }

        for (Customer c : db.getCustomers()) {
            System.out.println(c);
        }

        CustomerDatabase.Companion.helloWorld(); // call static method

        CustomerDatabase.helloWorld(); // use jvmstatic annotation if developer do not want a Companion
        
    }
}
