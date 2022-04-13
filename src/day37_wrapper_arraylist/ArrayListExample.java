package day37_wrapper_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println(numbers);



         // add/ assign to an array [index] = value


        numbers.add(100);
        System.out.println(numbers);

        numbers.add(-100);
        System.out.println(numbers);

        numbers.add(50);
        numbers.add(23);

        System.out.println(numbers);

        // in array how do we access each element : arr[index]


        System.out.println(numbers.get(3));

        // how do you know how many elements are in the array : arr.length
        //is length a method --> no









        System.out.println(numbers.size());


        System.out.println(numbers.get(numbers.size()-1));

        System.out.println();

        Collections.addAll(numbers,1,2,3,4,5);

        System.out.println(numbers);

//       List<Integer> list = new ArrayList<>();
//        Collections.addAll(list, 1, 2, 3, 4, 5);
//
//        System.out.println(list);





        System.out.println();

//        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("a", "b"));
//
//        Collections.addAll(arrayList, "c", "d");
//
//        System.out.println(arrayList);   //[a, b, c, d]
    }
}
