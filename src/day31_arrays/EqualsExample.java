package day31_arrays;

import java.util.Arrays;

public class EqualsExample {

    public static void main(String[] args) {

        int [] a ={1,2,3,4,5};
        int [] b = {1,2,3,4,5};
        int [] c = {1,2,4,3,5};
        int [] d = a;

        System.out.println(a == b);// compares the a array with the b array, they are different object -- not the same
        System.out.println(Arrays.equals(a,b));
        System.out.println(Arrays.equals(a,c));

        System.out.println(a == d); // compares the a array with the d array, they are both reference to the same array object
        //System.out.println(a.equals(b)); // THIS method is not Arrays.equals()

        boolean same = Arrays.equals(a,b);


        int [] f = {5,4,3,2,1};
        System.out.println(Arrays.equals(a,f));

    }
}
