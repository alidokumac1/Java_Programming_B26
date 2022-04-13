package day23_loop;

public class CountLetter {
    public static void main(String[] args) {


        String str = "aabbcca";

        char letter= 'a';

        int count = 0;


        for (int i = 0; i < str.length(); i++){

            System.out.println(str.charAt(i));

            if (str.charAt(i) == letter){ // checks if every character is equal to a
                count++;


            }

        }

        System.out.println(count);





    }


}
