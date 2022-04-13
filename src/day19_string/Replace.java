package day19_string;

import java.util.Scanner;

public class Replace {


    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);

        System.out.println("Choose 1-3 number");

        String message1 = "java class is fun.";

        int num = input.nextInt();

        if (num ==1 ){

            System.out.println(message1.replace('a' , 'e'));
        }else if (num == 2){

            System.out.println(message1.replace('s' , 'r'));
        }else if (num == 3){
            System.out.println(message1.replace('u' , 'z'));
        }

        String res = message1.replaceAll("(?:a)+" , "b");
        System.out.println(res);








    }
}
