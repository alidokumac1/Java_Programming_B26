package PracticeExtra;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {


        int[] nums = {16, 18, 98, 25, 46};
        int number = 0;
        System.out.println(Arrays.toString(nums));
        for (int i = nums.length - 1; i >= 0; i--) {
            number += nums[i];
            System.out.print(nums[i] + " ");

        }


        int [] numbers = {4, 9, 10, 17,};

        int average = (numbers[0] + numbers[1] + numbers[2] + numbers[3])/numbers.length;

        System.out.println(average);
    }
}
