package day24_loops;

public class RemoveDuplicates {

    /*

            Write a program that can remove duplicates from a String Ex:
            Input: abcabc Output: abc

     */


    public static void main(String[] args) {

        String s = "abcabc";
        String unique = "";

        for (int i = 0; i < s.length(); i++ ) {

            if (!unique.contains("" + s.charAt(i))) {

                unique += s.charAt(i);

            }
        }

        System.out.println(unique);




    }
}
