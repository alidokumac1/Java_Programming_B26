package day11_if_statements;
import java.util.Scanner;
public class Temperature {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What's the temperature");

        int temperature = input.nextInt();

        if (temperature >= 70){
            System.out.println("It's a nice day.");
            System.out.println("Go out side, but with your laptop to code java");

        }else {
            System.out.println("Its to cold");
            System.out.println("Code more java");


        }





    }

}
