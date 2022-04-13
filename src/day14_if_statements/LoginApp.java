package day14_if_statements;

import java.util.Scanner;

public class LoginApp {
    //    inputs:
//    declare and assign a 4 digit pin code
//    declare and assign the last 4 digits of ssn: 1234
//
//    declare and assign expected values for both
//    example expected:
//    pin: 1552
//    ssn: 1234
//
//    outputs:
//
//    when the pincode and ssn match the expected print:
//    Authentication successful
//
//    when the pincode or ssn are not correct print:
//    Authentication failed
//
//    when the pincode was not correct print:
//    incorrect pin code
//
//    whent he ssn is not correct print:
//    invalid ssn
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the 4 digit pin code");


        int actualPin = input.nextInt();

        System.out.println("Enter the last digits SSN number");

        int actualSSN = input.nextInt();

        int expectedPin = 1552;
        int expectedSSN = 1234;

      // boolean validPin = actualPin == expectedPin;
       // boolean validSSN = actualSSN == expectedSSN;   // boolean bu sekilde yapabiliyoruz






        if(actualPin == expectedPin && actualSSN == expectedSSN){
            System.out.println("Authentication successful");
        } else {

            System.out.println("Authentication failed");

            if(actualPin != expectedPin){
                System.out.println("incorrect pin code");
            }

            if(actualSSN != expectedSSN){
                System.out.println("incorrect ssn");
            }

        }



//        boolean validPin = actualPin == expectedPin;
//        boolean validSSN = actualSSN == expectedSSN;
//
//
//
////
//        if(validPin == validSSN) {
//            System.out.println("CORRECT");
//        }else{
//            System.out.println("FAILED");
//
//            if (!validPin){
//                System.out.println("PIN FAILED");
//            }
//            if (!validSSN){
//                System.out.println("SSN FAILED");
//            }
//        }



//    if (pin == 1552 && ssn == 1234){
//        System.out.println(" Authentication successful");
//    } else {
//
//        System.out.println("Authentication failed");
//    } if (pin!=1552){
//
//        System.out.println("incorrect pin code");
//    }if (ssn!= 1234){
//
//        System.out.println(" invalid ssn");
//
//    }


    }
}
