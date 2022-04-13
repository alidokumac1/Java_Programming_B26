package PracticeExtra;

import java.util.Scanner;

public class Interview {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        System.out.println("Enter the user name");

        String userName = input.nextLine();


        if (userName.length() > 3 && userName.startsWith("aaa")){
            System.out.println("Long in");


        }else {
            System.out.println("Wrong");
        }





    }
}
