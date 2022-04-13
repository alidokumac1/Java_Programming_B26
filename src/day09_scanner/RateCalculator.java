package day09_scanner;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class RateCalculator {

    public static void main(String[] args) {



   Scanner input = new Scanner(System .in);

        System.out.println(" Annual Salary : ");

        double salary = input.nextDouble();

        System.out.println("How many hour work in a week? ");

        int weekHour = input.nextInt();

        double rate = salary / (weekHour * 52);
        System.out.println("Hourly weekly rate : " + rate * weekHour + " and the hourly rate is : " + rate);

        double gross = rate * weekHour * 4;

        double tax = gross /0.7;

        System.out.println(gross);
        System.out.println(tax);
}

}
