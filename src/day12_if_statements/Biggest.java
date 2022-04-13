package day12_if_statements;
import java.util.Scanner;
public class Biggest {

    public static void main(String[] args) {
        System.out.println("Enter the 3 numbers");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is the biggest");

        } else if (num2 > num3 && num2 >= num1) {
        System.out.println(num2 + " is the biggest");

    }else {
            System.out.println(num3 + " is the biggest");


        }

    }
}
