package OfficeHours;

import java.util.Arrays;

public class singleLineArr {

    public static void singleLineArr(int[] arr1, int[] arr2) {

        int[] result = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {

            result[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {

            result[i + arr1.length] = arr2[i];
        }

        System.out.println(Arrays.toString(result));
    }


    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8, 9, 10};
        singleLineArr(arr1, arr2);

    }
}