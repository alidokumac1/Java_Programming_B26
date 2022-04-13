package day14_if_statements;
import java.util.Scanner;
public class NestedIfStatements2 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int minute = input.nextInt();

        String result = "";

        if (minute >= 0 && minute <= 90) {

            if (minute <= 90 && minute >= 75) {
                result = "just getting started ";
            } else if (minute <= 74 && minute >= 60) {
                result = "players are doing their best";

            } else if (minute <= 59 && minute >= 30) {
                result = "middle of the game is going great";
            } else if (minute <= 29 && minute >= 0) {
                result = "The end of the game is approaching";
            }
            System.out.println(result);


        }else {
            if (minute < 0){
                result ="Minute cannot be a negative number";
            }else if (minute > 90){
                result = "Games cannot be longer then 90 minutes";
            }
            System.out.println(result);
        }

    }

}
