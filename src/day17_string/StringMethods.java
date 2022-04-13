package day17_string;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {

        String name = "james";
        // how to compare String values --> use. equals ()
        System.out.println(name.equals("james"));

        System.out.println("cat".equals("dog"));

        System.out.println(name.equals("James"));


        String a = new String("hello");
        String b = new String("hello");
        System.out.println(b.equals(a));

        System.out.println(a.equals("hello"));
        System.out.println(a.equals("java"));

        System.out.println(name.length());

        String last = "today was fun";
        System.out.println(last.length());
        System.out.println(last.equals("today"));


        String text = "     Hello world!";
        String result = text.repeat(4);
        text = text.trim();
        System.out.println(text);


        System.out.println(result);


        String s1 = "";
        String s2 = "Javatpoint";
        // Either length is zero or isEmpty is true
        if (s1.length() == 0 || s1.isEmpty())
            System.out.println("String s1 is empty");
        else System.out.println("s1");
        if (s2.length() == 0 || s2.isEmpty())
            System.out.println("String s2 is empty");
        else System.out.println(s2);


        String myStr1 = "Hello";
        String myStr2 = "";
        System.out.println(myStr1.isEmpty());
        System.out.println(myStr2.isEmpty());


        String mySt = "Hello";
        System.out.println(mySt.replace('H', '阿'));


        String Str = new String("Welcome to example.com");
        System.out.println(Str);
        System.out.print("Return Value :");
        System.out.println(Str.replaceFirst("(.*)example(.*)", "java"));

        System.out.print("Return Value :");
        System.out.println(Str.replaceFirst("example", "java"));
        System.out.println();


        // trims the trailing and leading spaces
        String s = " geeks for geeks has all java functions to read  ";
        System.out.println(s.trim());

        // trims the leading spaces
        s = " Chetna loves reading books";
        System.out.println(s.trim());

        String s3 = "   Geeks For Geeks   ";

        // Before Trim() method
        System.out.println("Before Trim() - ");
        System.out.println("String - " + s3);
        System.out.println("Length - " + s3.length());

        // applying trim() method on string s1
        s3 = s3.trim();

        // After Trim() method
        System.out.println("\nAfter Trim() - ");
        System.out.println("String - " + s3);
        System.out.println("Length - " + s3.length());

        String tet = "           Hello world!";
        System.out.println(tet);
        System.out.println(tet.length());
        tet = tet.trim();
        System.out.println(tet);
        System.out.println(tet.length());
    }

}




