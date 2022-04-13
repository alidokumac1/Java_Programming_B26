package day14_if_statements;

public class AmazonPrime {
    public static void main(String[] args) {


        double price = 20.99;
        boolean hasPrime = false;

        boolean smokeTest = false;

        if (false);

        if (hasPrime) {

            System.out.println("Eligible for 2 day shipping");

        }else {

            if (price >= 25) {
                System.out.println("Eligible for regular free shipping");
            } else {
                System.out.println("Not eligible for free shipping. Shipping fee: 3.99");
                price += 3.99; // price = price + 3.99
                System.out.println(price);
            }

        }








    }
}