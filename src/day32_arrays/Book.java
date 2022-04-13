package day32_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Book {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many chapters is there");
        String [][] book = new String[input.nextInt()][];
        System.out.println(Arrays.deepToString(book));
        input.nextLine();

        for (int i = 0; i < book.length; i++){
            System.out.println("Enter chapter " + (i +1));
            String chapter = input.nextLine();
            String [] sentences = chapter.split("! "); // breaking up by the dot
              book [i] =sentences;
        }
        System.out.println(Arrays.deepToString(book));
    }
}

//Today wa multi array day. Tomorrow we start methods. We will start with void method
//Enter chapter 2
//Arrays are fun. Loops are also fun
//Enter chapter 3
//James bond is back.
//[[], [], []]