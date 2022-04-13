package day19_string;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first name");
        String first = input.nextLine().toUpperCase();


        System.out.println(" Enter the last name");
        String last = input.next().toUpperCase();
        //int lastIndex = last.length()-1;
        String res = last.replaceFirst("(?:i)+" , "a");


        System.out.println("" + first.charAt(0) + last.charAt(0));

        // System.out.println(last.charAt(lastIndex));




    }
}
