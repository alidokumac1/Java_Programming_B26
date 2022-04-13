package day20_string;

import java.util.Scanner;

public class Email {



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the  word");

        String one = input.nextLine().toLowerCase();
        System.out.println("Enter the second  word");
        String two = input.nextLine().toLowerCase();
          String last = "@cybertek.com";

        if (one.length() >=6 && two.length() >= 6){

            System.out.println(one.substring(0 , 4) +  two.substring(two.length()- 3) + last);





        }else {
            System.out.println("Invalid data");
        }
    }
}
