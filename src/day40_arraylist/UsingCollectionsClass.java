package day40_arraylist;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UsingCollectionsClass {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(3,6,2,67,22,230,12));



        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));




        ArrayList<Character> letters = new ArrayList<>(Arrays.asList('A', 'B', 'C', 'D'));

        Collections.reverse(letters);//dcba
        System.out.println(letters);

        Collections.reverse(letters);//abcd
        System.out.println(letters);


        Collections.swap(letters,0,3);
        System.out.println(letters);


        List<Integer> numbers = new ArrayList<>(Arrays.asList(11,11,20,11,20,30));

      //  Collections.frequency(numbers,11);
        System.out.println(Collections.frequency(numbers,11));

        List<String> words = new ArrayList<>(Arrays.asList("one", "two", "one", "one", "one", "three"));
        System.out.println(Collections.frequency(words,"one"));








    }
}
