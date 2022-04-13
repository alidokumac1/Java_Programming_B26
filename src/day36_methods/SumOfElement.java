package day36_methods;

import java.util.Arrays;

public class SumOfElement {

    public static void main(String[] args) {
        int arr [] = {1, 5, 6, 2};
        System.out.println(sum(arr));



        System.out.println(sum(4, 6, 2, 6, 12, 4));
    }

    public static int sum(int ... nums) {

        int sum = 0;
        for (int each : nums) {
            sum += each;

        }
        return sum;


    }


    // Normal Version

//    public static int sum(int [] nums){
//
//        int sum = 0;
//        for (int each : nums){
//            sum += each;
//
//        }
//        return sum;
//    }
}
