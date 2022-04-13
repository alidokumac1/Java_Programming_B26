package day15_switch;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class GiftCard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the item. \nPlease see select one of the following: \n1-Blanket\n2-Charger\n3-Hat\n4-Headphone\n5-Laptop\n6-Pants\n7-Pillow\n8-Smartphone\n9-Sock\n10-USB cable");
        String selection = input.next();
        System.out.println("Please Enter the QTY");
        int qty = input.nextInt();
        int giftCard = 100;
        int price=0;
       int balance = 0;
        int inventory = 0;
        boolean isValid = true;





        switch (selection) {
            case "Blanket":
               if (selection.compareToIgnoreCase(selection) == 0)
                inventory = 6;
                price = 25 * qty;


                if (qty > inventory || qty == 0) {
                    System.out.println("We don't have enough QTY. Please see the available QTY: " + inventory);
                }else if (price>100){
                    System.out.println("Sorry, not enough funds on your gift card");

                    }
                    break;
                    case "Charger":
                        inventory = 12;
                        price = 5;
                        break;
            case "Hat":
                inventory =10;
                price =25;
                break;





            default:
                System.out.println("Sorry, that is an invalid item");
                isValid = false;




        }

        if (isValid) {
            balance = giftCard -price;
            if (price <= giftCard)
            System.out.println("Thank you for your purchase! \n Your balance is : " + balance);
        }else if (qty > inventory || qty == 0) {
            System.out.println("We don't have enough QTY. Please see the available QTY: " + inventory);
        }else if (price>100) {
            System.out.println("Sorry, not enough funds on your gift card");

        }else {
            System.out.println("Nothing");


        }}

    }

