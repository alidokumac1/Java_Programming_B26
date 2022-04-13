package day19_string;

import java.util.Scanner;

public class LongestWithA {

//    create a class LongestWithA
//ask the user to enter 3 String inputs. Find and print the longest word that also contains 'a'
//
//    Ex:
//            "java"
//            "mouse"
//            "computer"
//
//    Output: java
//
//    Challenge: Instead of just checking for "a" add another variable that can be used to check for any character.
public static void main(String[] args) {

  Scanner input = new Scanner(System.in);
    System.out.println("Enter three words");
    String wordOne = input.next().toLowerCase();
    String wordTwo = input.next().toLowerCase();
    String wordThree = input.next().toLowerCase();

    int one = wordOne.length();
    int two = wordTwo.length();
    int three = wordThree.length();


    if(wordOne.contains("a") && one >two && one > three){

        System.out.println(wordOne + " is the biggest with a");

    } else if (wordTwo.contains("a") &&two >one && two > three){
        System.out.println(wordTwo + " is the biggest with a");
    }else if (wordThree.contains("a") && three > one && three > two){
        System.out.println(wordThree + " is the biggest with a");
    }else {
        System.out.println("No single largest word with a");
    }


}

}
