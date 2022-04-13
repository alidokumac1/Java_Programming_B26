package PracticeExtra;

import java.util.Arrays;

public class EvenOdd {

    public static void main(String[] args) {

        int [] numbers = { 3, 4, 5, 6, 8, 9, 12, 13, 17, 20 ,23, 26, 33};

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < numbers.length; i++){
            int number = numbers [i];
            if (number % 2 == 0){
                evenCount++;
            }if (number % 2 != 0){
                oddCount++;
            }
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("Even : " + evenCount );
        System.out.println("Odd : " + oddCount);

    }
    }



