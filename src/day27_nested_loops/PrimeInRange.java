package day27_nested_loops;

public class PrimeInRange {
    public static void main(String[] args) {

        int range = 50;

        for (int i = 2; i <= range; i++) { // the purpose of this loop is to check all the numbers from 2 to the value the range variable

            int count = 0; // putting the counter inside the outer loop will reset it back to 0 for the next number

            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    count++;
                }

            } // end of inner loop

            if (count == 0) {
                System.out.print(i + ", ");
            }

        }
    }
}






