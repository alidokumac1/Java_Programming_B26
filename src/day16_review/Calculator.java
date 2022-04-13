package day16_review;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        double numOne = input.nextDouble();
        System.out.println("Pick opetators: + - * / % ");

        String operators = input.next();
        System.out.println("Enter number two: ");
        double numTwo = input.nextDouble();

        double result= 0;
          boolean validCalc = true;

        switch (operators){

            case "@":
            case "+":
                result= numOne + numTwo;
                break;
            case "-":
                result = numOne - numTwo;

                break;
            case "*":
                result = numOne * numTwo;
                break;

            case "/":
                if (numTwo != 0) {
                    result = numOne / numTwo;
                }else {
                    System.out.println("Can not divide by 0");
                    validCalc =false;
                }
                break;
            case "%":
                if (numTwo != 0) {
                    result = numOne % numTwo;
                }else {
                    System.out.println("Can not remainder by 0");
                    validCalc =false;

                }
                result = numOne % numTwo;
                break;

            default:
                System.out.println(operators + " is not a valid operators for this calculator");

                validCalc = false;

        }

        if (validCalc) {
            System.out.println(numOne + " " + operators + " " + numTwo + "  = " + result);

        }





    }
}
