package PracticeExtra;

import java.util.ArrayList;
import java.util.Arrays;

public class TargetWord {
    public static void main(String[] args) {


        ArrayList<String> target = new ArrayList<>(Arrays.asList("java", "java","html", "css", "java", "javascript","selenium"));

        String letter = "java";
        int count = 0;

        for (String a : target){

            if (letter == a ){
                count++;

            }

        }

        System.out.println(count);


        System.out.println();

         ArrayList<String> fourLess = new ArrayList<>(Arrays.asList("apples", "tree", "loop", "cat", "animal", "shortcut"));

        ArrayList<String> words = new ArrayList<>();


         for (String each : fourLess){

           if (each.length() <= 4 ){

               words.add(each);

           }



         }
        System.out.println(words);

        String [] arr=  {"Cat", "in", "the", "hat"};

        ArrayList<String> eachPairs = new ArrayList<>();

        for (int i = 0; i < arr.length; i+=2) {
            eachPairs.add(arr[i+1]);
            eachPairs.add(arr[i]);
        }
        System.out.println(eachPairs);




    }


}
