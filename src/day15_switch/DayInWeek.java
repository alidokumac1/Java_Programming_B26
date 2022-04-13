package day15_switch;
import java.util.Scanner;
public class DayInWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a day number: 1-7");
        int number = input.nextInt();

        String day = " ";


        switch (number){
            case 1:
                day= "MONDAY";

                break;

            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4 :
                day = "Thursday";
                break;
            case 5 :
                day = "Friday";
                break;
            case 6 :
                day = "Saturday";
                break;
            case 7 :
             day = "Sunday";
                break;

            default:
                System.out.println("Invalid Number");



        }

        System.out.println(day);





    }
}
