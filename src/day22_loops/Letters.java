package day22_loops;

public class Letters {

    public static void main(String[] args) {


        char lowerLetter = 'a';

        while (lowerLetter <= 'z'){

            System.out.print(lowerLetter + " ");
            lowerLetter++;

        }
        System.out.println();

        char upperLetter = 'A';

        while (upperLetter <= 'Z'){

            System.out.print(upperLetter + " ");

            upperLetter++;
        }
        System.out.println();


        char upper = 'Z';

        while (upper >= 'A'){

            System.out.print(upper + " ");

            upper--;
        }

        System.out.println();

        char c = '我';

        while (c <= '爷'){

            System.out.print(c + " ");
            c++;
        }






    }
}
