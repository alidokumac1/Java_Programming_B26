package day37_wrapper_arraylist;

import java.util.Arrays;

public class CountTheCharacters {


    /*
    given some string, count the number of uppercase letter, lowercase letters, numbers,and other characters

    aP3d572&*jd@jdJU
     */

    public static void main(String[] args) {


        String str = "aP3d572&*jd@jdJU";
        int upper = 0, lower = 0, number = 0, other = 0;
        String upperCaseChars = "", lowercaseChars = "";




        for (int i = 0; i < str.length(); i++){
            char letter = str.charAt(i);
            if (Character.isUpperCase(letter)){

                upper++;
                upperCaseChars +=letter;
            }else if (Character.isLowerCase(letter)){
                lower++;
                lowercaseChars += letter;
            }else if (Character.isDigit(letter)){
                number++;
            }else {
                other++;
            }


        }

        System.out.println("Upper: " +upper);
        System.out.println("Uppercase letters: " + Arrays.toString(upperCaseChars.toCharArray()));
        System.out.println("Lower: " + lower);
        System.out.println("Lowercase letters: " + Arrays.toString(lowercaseChars.toCharArray()));
        System.out.println("Number: " + number);
        System.out.println("Other: " + other);







    }
}