package day23_loop;

public class PalindromeSaimCode {

    public static void main(String[] args) {

        String str = "racecar";

        String reverse = "";

        for (int i = str.length() -1; i >= 0; i--){

            reverse += str.charAt(i);

        }
        System.out.println(reverse);
        if (str.equals(reverse)){

            System.out.println(str + " is" + " Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }


        System.out.println(str.equals(reverse) ? "Palindrome" : "Not Palindrome");





    }
}
