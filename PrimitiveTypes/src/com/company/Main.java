package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        byte myByte = 100;
        short myShort = 1_000;
        int myInt = 10_000;
        long myLong = 50_000+ 10 *(myByte+myShort+myInt);

        System.out.println("my long "+ myLong);
    }
}
