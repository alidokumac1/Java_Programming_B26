package day10_scanner;
import java.util.Scanner;

public class Order {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the product name");

        String productName = input.nextLine();

        System.out.println("Please enter the price of the " + productName);
        double price = input.nextDouble();
        System.out.println("How many " + productName + " 's do you want to buy");
        int quantity = input.nextInt();
        System.out.println("What is the name for the order");
        input.nextLine();
        String fullName = input.nextLine();

        double totalCost = price * quantity;

        String order = fullName + ", your order for " + quantity + " " +productName + "'s has been placed. Your total is $" +totalCost;

        System.out.println(order);





    }
}
