package day29_arrays;

public class ForEachExample {
    public static void main(String[] args) {




        int [] arr = {1,2,3,4,5,6,7,8,9};

        for (int num : arr){

            System.out.println(num);
        }


        //String example


        String [] classes = {"java" , "soft skills", "selenium", "database", "api"};

        for (String element : classes){

            System.out.println(element);
        }

        System.out.println(" ");

        // double example

        double [] prices = {10.4, 40.2, 410.2};

        // for each

        for (double each : prices){
            System.out.println("$" + each);
        }
    }
}
