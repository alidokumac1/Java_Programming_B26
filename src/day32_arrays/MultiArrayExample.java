package day32_arrays;

import java.util.Arrays;

public class MultiArrayExample {
    public static void main(String[] args) {

        int[] n = {5, 10, 20, 10};
        int[] m = {5, 10, 100, 39, 19};


        int[][] all = {n, m};

        System.out.println(Arrays.deepToString(all));

        System.out.println("First array:" + Arrays.toString(all[0]));

        System.out.println("First array first element:" + all[0][0]);

        System.out.println("Second array: " + Arrays.toString(all[1]));
        System.out.println("Second array first element : " + all[1][0]);

        System.out.println();
        int[][] multi = {

                {903, 80, 70},
                {19, 51, 1129, 12},
                {10, 1900},
                {14}


        };
        System.out.println(Arrays.deepToString(multi));
        System.out.println(multi.length);
        System.out.println(multi[0].length);
        System.out.println(multi[0][1]);
        System.out.println(multi[3].length);
        System.out.println(multi[3][0]);




    }

}
