package day23_loop;

public class Palindrome {
    public static void main(String[] args) {


        // Palindrome : it's the same reading from the beginning and end


        // Ex:  mom
        //   racecar  anna madam



        String str= "Racecar", nstr="";
        char ch;

        System.out.print("Original word: ");
        System.out.println("racecar");

        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i);
            nstr= ch + nstr;
        }

        System.out.println("Reversed word: "+ nstr);


        System.out.println();


        String palindrome = "";

        for (int i = str.length() - 1; i >= 0 ; i--) {

            palindrome += str.charAt(i);

        }

        if (str.equals(palindrome)) {

            System.out.println("the word is a palindrome");

        } else {

            System.out.println("the word is not a palindrome");

        }






    }




}
