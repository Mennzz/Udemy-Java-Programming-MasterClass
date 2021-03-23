package com.company;

public class Main {

    public static void operatorChallenge()
    {
        double myDouble = 20.00;
        double mySecDouble = 80.00;
        double doubleSum = (myDouble+mySecDouble)*100.00;
        double reminder = doubleSum % 40.00;

        boolean checkReminder = (reminder==0.0)? true:false;

        if(!checkReminder) {
            System.out.println("Get some reminder");
        }

    }

    public static void main(String[] args) {
        operatorChallenge();
    }
}
