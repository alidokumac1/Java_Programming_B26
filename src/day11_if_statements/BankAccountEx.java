package day11_if_statements;
import java.util.Scanner;
public class BankAccountEx {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        double balance = input.nextDouble();
        double withdraw = input.nextDouble();



        balance -= withdraw;

         if (  balance < 0 ){

        System.out.println("Your balance is : $ " + balance);
        balance -=100;


    }

             System.out.println(balance);
}
    }
