package day16_review;

import java.util.Scanner;

public class SoccerGame {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many minutes are lest in the game");
        int minutes = input.nextInt();

        boolean isvalid = true;

        if (minutes <= 90 && minutes >= 0) {

            if (minutes >= 75) {
                System.out.println("Game just getting started");

            } else if (minutes >= 60) {
                System.out.println("Players are doing their best");
            } else if (minutes >= 30) {
                System.out.println("Middle of the game is going great");
            } else {
                System.out.println("The end of the same is approaching");
            }


        } else {


            if (minutes < 0) {
                System.out.println("Can not be negative number");
            } else {
                System.out.println("Cant be more than 90");

            }
        }
        System.out.println(minutes <0 ? "can not be negative " : " Cannot be more than 90");






        }
    }
