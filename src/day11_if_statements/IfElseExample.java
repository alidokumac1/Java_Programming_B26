package day11_if_statements;

public class IfElseExample {

    public static void main(String[] args) {


        int score = 50;
        if (score >= 75) {
            System.out.println("Passing");
        } else {
            System.out.println("Failing");
        }


        int year = 2022;
        boolean lockdown = year == 2020 || year == 2021;

        if (lockdown) {
            System.out.println("Stay at home");
            System.out.println("Practice Java");
            System.out.println("Wear mask");


        } else {

            System.out.println("Party");
            System.out.println("Still practice java");
            System.out.println("Maybe travel");


        }


    }

}
