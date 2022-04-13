package day21_loops;

public class Practice {

    public static void main(String[] args) {

        int i = 1;

        while (i <= 10) {
            i++;

            System.out.println(i);

            int a = 1;

            do {
                System.out.println("Hello");
                a++;

            } while (a <= 5);

            for (int b = 1; b <= 5; b++) {
                System.out.println("Hello Guys");
            }

            for (int b = 1; b <= 5; b++) {
                System.out.print(b+ " ");
            }
            System.out.println();

            for (int b = 1; b <= 5; b++) {
                System.out.print(b+ " ");
            }
            System.out.println();

            for (int b = 1; b <= 5; b++) {
                System.out.print(b+ " ");
            }
            System.out.println();

            for (char c = 'A' ; c <= 'E'; c++){
                System.out.println(c);
                if (c== 'C'){
                    break;
                }

                System.out.println("----------------------------------");


                }
            for (int d = 1; d <= 5 ; d++){
                System.out.println(d);
                if (d == 3);
                break;
            }

            System.out.println("----------------------------------");

            for (char j = 'A' ; j <= 'E' ; j++){
                if (j == 'B'){
                    continue;
                }
                System.out.println(j);
            }

        }
    }
}
