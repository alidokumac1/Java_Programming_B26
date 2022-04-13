package day29_arrays;

public class AverageNumber {

    public static void main(String[] args) {


        int [] nums = {10 , 15, 5, 6};
        int sum = 0;

        // Traditional
//        for (int i = 0; i <nums.length; i++){
//
//            sum += nums[i];
//        }


        // For each Loop :

        for (int each : nums){

            sum += each;
        }
        System.out.println("average: " + (sum/nums.length));




        }



    }

