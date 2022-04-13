package day13_if_statements;

import java.util.Scanner;

public class FizzBuzz1 {

//    you will have a number
//
//     if the number is divisible by 3 print -> Fizz
//     if the number is divisible by 5 print -> Buzz
//     if the number is divisible by both 3 and 5 -> FizzBuzz
//     if the number is not divisible by any of those, print just the number
//


    public static void main(String[] args) {

        System.out.println("Please Enter The Number ");

        Scanner input = new Scanner(System.in);


        System.out.println("Enter the number");

        int n = input.nextInt();
        String a;

        if (n % 3 == 0 && n % 5 == 0){
            a = "FizzBuzz";

        }else if (n % 3 == 0 ){

            a = "Fizz";
        }else if ( n % 5 == 0 ){
          a= "Buzz";
        }else {
            a = "Nothing";
        }
        System.out.println(a);

    }
}
