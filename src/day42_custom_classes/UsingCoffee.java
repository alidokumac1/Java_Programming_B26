package day42_custom_classes;

import day40_arraylist.ArrayListWithMethods;

public class UsingCoffee {
    public static void main(String[] args) {

        Coffee item1 = new Coffee();
        item1.brand = "Starbucks";
        item1.price = 4.99;
        item1.type = "Latte";
        item1.size = 16;

        System.out.println(item1);

        item1.drink();
        item1.drink();
        item1.drink();
        item1.drink();





        item1.refill(8);
        System.out.println(item1);

        System.out.println();



    }
}
