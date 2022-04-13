package day32_arrays;

import java.util.Arrays;

public class Groups {
    public static void main(String[] args) {

        String [][] cydeo = new String[4][];
       // String [][] cydeo = new String[4][3]; 4 inner arrays that each have a size of 3
        System.out.println(Arrays.deepToString(cydeo));


        String [] groupOne = {"Emre", "Yasir", "Eda"};
        cydeo [0] = groupOne;

        System.out.println(Arrays.deepToString(cydeo));

        System.out.println("Adding group 2");

        String [] groupTwo = {"Basri", "Demet", "Shina", "Ismayil"};
        cydeo [1] =groupTwo;
        System.out.println(Arrays.deepToString(cydeo));

        System.out.println("Adding group 3 ");
        cydeo [2] = new String[]{"Mustafa", "Lima"};
        System.out.println(Arrays.deepToString(cydeo));

        System.out.println("same group 3 as group 4");
        cydeo [3] = cydeo[2];
        System.out.println(Arrays.deepToString(cydeo));

        System.out.println();
        System.out.println();


        for (String [] innerArray : cydeo){ // loops through the 2d array , cydeo

            for (String eachWord : innerArray){ // loops through every String element in each 1d inner array

                System.out.println(eachWord);



            }


        }










    }
}
