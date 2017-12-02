package com.company;

import exceptions.InvalidValueException;

public class Main {

    public static void main(String[] args) throws InvalidValueException {
        // write your code here

        ZipCode zipCode = new ZipCode("Zdrav199");
        System.out.println("zipCode = " + zipCode.toString());
    }
}
