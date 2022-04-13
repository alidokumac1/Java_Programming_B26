package day11_if_statements;

import java.util.Scanner;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Your Balance is : 50");
        System.out.println("How much you want to withdraw");


        double withdraw = input.nextDouble();


        double balance = 50;

        balance -= withdraw;

        if (balance < 0) {
            System.out.println("Took out too much money, $100 overdraft applied");
            System.out.println("Balance before fee: " + balance);
            balance -= 100;


        }

        System.out.println("Balance: $ " + balance); // I want to see my balance any time, so I put the code outside the if.

    }


}

