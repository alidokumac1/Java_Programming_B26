package day07_unary_operators.Day_08_relational_operator;

public class GiftCard {
    public static void main(String[] args) {

            /*


    Task:

        declare and assign a gift card with 200
        buy 2 item 1. buy 1 item for x price and subtract from your gift card

       buy item 2 for x price and subtract from your gift card
       print the reining balance of your gift card
     */



            double giftCard = 200;

            System.out.println("Buy item 1 for 100$");

            giftCard -= 100;

            System.out.println("Buy item 2 for 40$");
            giftCard -=  40; // giftCard = giftCard - 40;

            System.out.println("Your gift card balance is now: " + giftCard);

        }
    }

