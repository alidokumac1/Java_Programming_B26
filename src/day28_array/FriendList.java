package day28_array;

import java.util.Arrays;
import java.util.Scanner;

public class FriendList {

    public static void main(String[] args) {



    Scanner input = new Scanner(System.in);
        System.out.println("How many friends do you want to store");
        int size = input.nextInt();
         String [] friendList = new String[size];

         for (int i = 0; i < friendList.length; i++){

             System.out.println("Enter the name of friend " + (i + 1) );
             friendList[i] = input.next();




         }

        System.out.println(Arrays.toString(friendList));







}
}