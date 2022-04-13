package day11_if_statements;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.FilterOutputStream;

public class SingleIfExamples {
    public static void main(String[] args) {

        if (false) {
            System.out.println("Hello World");
        }

        System.out.println("Second Line");

        if (true){

            System.out.println("Today is monday");



        }

        int score = 60;

        if (score >= 75) {

            System.out.println("Passing");

        }

        if (score<75){

            System.out.println("Failing");


        }

        int year = 2022;
        boolean lockdown = year == 2020 || year == 2021;

        if (lockdown == true){

            System.out.println("Stay at home");
            System.out.println("Practice Java");
            System.out.println("Wear mask");


        }

        if (!lockdown){ //!false -> true

            System.out.println("Party");
            System.out.println("Still practice java");
            System.out.println("Maybe travel");
        }
    }
}



