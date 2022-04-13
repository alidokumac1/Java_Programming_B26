package day28_array;

import java.util.Arrays;

public class ArrayIntro {

    public static void main(String[] args) {

        // with normal variables


        String cityOne = "Chicago";

        String cityTwo = "New York";

        String cityThree =  "Houston";
        String cityFour = "Denver";
        String cityFive = "Pittsburgh";


        // declare array with values

        String [] cities = {"Chicago" , "New York" , "Houston", "Denver", "Pittsburgh", };

        String [] cities2 = {cityOne, cityTwo, cityThree, cityFour,cityFive};


        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);
        System.out.println(cities[3]);
        System.out.println(cities[4]);


        // print the array all at one time

        System.out.println("Reverse order of the cities " + cities[4] + ", " + cities[3] + ", " + cities[2] + ", " + cities[1]);

        // print the array all at one time;
       // System.out.println(cities); // this doesn't print the array how we want

        System.out.println(Arrays.toString(cities)); // this method from Arrays class lets you print the array fully

        // number of elements

        System.out.println(cities.length);

    }


}
