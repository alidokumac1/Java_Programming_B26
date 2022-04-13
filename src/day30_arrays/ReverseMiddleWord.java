package day30_arrays;

import java.util.Arrays;

public class ReverseMiddleWord {
    public static void main(String[] args) {

        String str = "java always fun";

        String [] words = str.split(" ");

        String reverse = " ";
        char [] middleWord = words[1].toCharArray();

        for (int i = middleWord.length -1; i >=0; i--){

            reverse += middleWord [i];







        }

        System.out.println("" +words[0] + " " + reverse + " " +words[2]);

//        String sentence = "java always fun";
//        String[] sentArray = sentence.split(" ");
//        String middleWord = sentArray[1];
//        String reversedMid = "";
//
//        for(int i = middleWord.length() - 1; i >= 0; i--){
//
//            reversedMid += middleWord.charAt(i);
//
//        }
//        System.out.println(""+ sentArray[0] + " " + reversedMid + " " + sentArray[2]);


        System.out.println(Arrays.toString(str.split("")));

    }
}
