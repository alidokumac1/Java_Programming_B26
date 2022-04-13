package MytryCode;

import java.util.Arrays;
import java.util.Collections;

public class ArraySoft {
    public static void main(String[] args) {


        int[] arr = {13, 7, 6, 45, 21, 9, 101, 102};

        // Applying sort() method over to above array
        // by passing the array as an argument
        Arrays.sort(arr);


        // Printing the array after sorting
        System.out.println("Modified arr[] : %s" + Arrays.toString(arr));


        System.out.println();

        String[] ali = {"aaa", "bbb", "aac"};


        Arrays.sort(ali);

        System.out.println(Arrays.toString(ali));


        System.out.println();



       // /define original array
        int[] intArray = new int[]{52, 45, 32, 64, 12, 87, 78, 98, 23, 7};
        int temp = 0;

        //print original array
        System.out.println("Original array: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        //Sort the array in ascending order using two for loops
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] > intArray[j]) {      //swap elements if not in order
                    temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
        //print sorted array
        System.out.println("\nArray sorted in ascending order: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");


            System.out.println();

            String str_Array[] = {"Java", "Python", "Perl", "C++", "C#", "AS400"};

            System.out.printf("Original Array: \n%s\n\n", Arrays.toString(str_Array));

            // Sorts str_Array in ascending order
            Arrays.sort(str_Array);
            System.out.printf("Array sorted in ascending order: \n%s\n\n",
                    Arrays.toString(str_Array));

            // Sorts str_Array in descending order
            Arrays.sort(str_Array, Collections.reverseOrder());

            System.out.printf("Array sorted in descending order : \n%s\n\n",
                    Arrays.toString(str_Array));

            // Q: Max and Min from Array


            System.out.println();


            // Let us create different integers arrays
            int[] arr1 = new int [] {1, 2, 3, 4};
            int[] arr2 = new int [] {1, 2, 3, 4};
            int[] arr3 = new int [] {1, 2, 4, 3};

            System.out.println("is arr1 equals to arr2 : " +
                    Arrays.equals(arr1, arr2));
            System.out.println("is arr1 equals to arr3 : " +
                    Arrays.equals(arr1, arr3));

        }
    }
}