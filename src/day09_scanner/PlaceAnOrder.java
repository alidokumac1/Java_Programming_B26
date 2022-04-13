package day09_scanner;

import java.util.Scanner;

public class PlaceAnOrder {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        System.out.println(" What would like to get today? ");

        String order = input.next();

        System.out.println("The price is : " );

        double price = input.nextDouble();

        System.out.println("How many piece? ");
        int qty = input.nextInt();
        System.out.println("Can I have the full name? ");
        String fullName = input.next();

        double total = price * qty;

        String orderdetails = fullName + " your order" + order+ " has been places. Your total is: $" + total;


        System.out.println(orderdetails);



















    }
}

