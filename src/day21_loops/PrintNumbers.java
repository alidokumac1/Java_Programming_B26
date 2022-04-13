package day21_loops;

public class PrintNumbers {

    public static void main(String[] args) {

        int n = 2;

        while (n <= 100) {

            System.out.println(n);

            n += 2;
        }
        System.out.println();
        // opproach 2"

        int i = 1;

        while (i <= 100) {

            if (i % 2 == 0) {
                System.out.print(i + " " );
            }
            i++;
        }

        System.out.println();


        // odd numbers

        int a = 1;


        while (a <= 100) {
            System.out.print(a + " ");
            a += 2; // a = a + 2;
        }


        System.out.println();

        int b= 0;

        while (b++ < 100) {

            if (b % 2 == 1) {
                System.out.print(b + " ");
            }





        }
    }
}