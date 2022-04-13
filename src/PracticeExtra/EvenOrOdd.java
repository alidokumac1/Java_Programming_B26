package PracticeExtra;

import java.util.Arrays;

public class EvenOrOdd {


    public static void printEven(int number) {

        for (int i = 0; i <= 100; i++){
            if (i % 2 == 0){
                System.out.print(i + " ");
            }

        }



    }

    public static void printOdd(int number){

        for (int i = 1; i<= 100; i++){

            if (i % 2 !=0){

                System.out.print(i + " ");
            }




        }
    }

    public static void main(String[] args) {

        printEven(100);
        System.out.println();

        printOdd(100);

    }
}


