package day28_array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxAndMin {

    public static void main(String[] args) {


        int[] nums = {-81, 120, -80, 90, 250, -10};

        int max = nums[0];
        int min = nums[0];


        for (int i = 0; i <nums.length; i++){

            int number = nums[i];

            if (number > max){   //if (nums[i] > max)
                max = number;

            }

            if (number < min){
                min = number;
            }


        }
        System.out.println("max: " + max);
        System.out.println("min: " + min);



//        if (num1 > num2 && num1 > num3) {
//            System.out.println(num1 + " is the biggest");
//
//        } else if (num2 > num3 && num2 >= num1) {
//            System.out.println(num2 + " is the biggest");
//
//        }else {
//            System.out.println(num3 + " is the biggest");
//


    }


}
