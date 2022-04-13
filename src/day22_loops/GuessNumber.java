package day22_loops;


import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int numberGuess=5;
        int numberOfTries = 1;
        int limit = 5;
        int guess = 0;

        System.out.println("You have 10 tries to guess a number between 1 and 100");

        while (numberOfTries <= 10) {
            System.out.println("Guess number " + numberOfTries + ": ");
            guess = input.nextInt();


            if (guess < numberGuess) {

                System.out.println(" Your guess is too low. Try again");

            } else if (guess > numberOfTries) {
                System.out.println("Too high");
            } else if (guess == numberGuess) {
                System.out.println("Awesome. that's my number");
            } else {
                System.out.println("Sorry you did not guess the answer in 10 time");
                System.out.println("the number was " + numberGuess);

                break;
            }
            numberOfTries++;

            if (numberOfTries > 10) {
                System.out.println("Sorry you did not guess the answer in 10 time");
                System.out.println("the number was " + numberGuess);
            }

        }
        }
    }

