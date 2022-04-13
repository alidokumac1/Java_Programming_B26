package day10_scanner;

import java.util.Scanner;
public class DivisibleBy {
    public static void main(String[] args) {


      Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers ");

        int num = input.nextInt();
                int num2 = input.nextInt();


        boolean by2 = num  % 2 == 0;
        boolean by3 = num %3 == 0;
        boolean by5 = num %5 == 0;

      boolean by6 = num2  % 2 == 0;
      boolean by7 = num2 %3 == 0;
      boolean by8 = num2 %5 == 0;

        System.out.println(num + " is divisible by 2: " + by2);
        System.out.println(num + " is divisible by 3: " + by3);
        System.out.println(num + " is divisible by 5: " + by5 +"\n");


      System.out.println(num2 + " is divisible by 2: " + by6);
      System.out.println(num2 + " is divisible by 3: " + by7);
      System.out.println(num2 + " is divisible by 5: " + by8);













    }
}
