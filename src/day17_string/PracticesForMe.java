package day17_string;

public class PracticesForMe {

    public static void main(String[] args) {
        String name = "james";
        String a = new String("hello");
        String b = new String("hello");
        System.out.println(b.equals(a));

        System.out.println(a.equalsIgnoreCase(b)); // true


        System.out.println(a.equals("hello"));
        System.out.println(a.equals("java"));

        System.out.println(name.length());

        // length

        String last = "today was fun";
        System.out.println(last.length());

       // repeat
        String text = "      Hello world!";
        String result= text.repeat(14);
        System.out.println(result);



        //trim
        System.out.println("-_______________________________-");

        String s = " geeks for geeks has all java functions to read  ";
        System.out.println(s.trim());

        // trims the leading spaces
        s = "         Chetna loves reading books";
        System.out.println(s);
        System.out.println(s.trim());

        String s3 = "   Geeks For Geeks   ";

        // Before Trim() method
        System.out.println("Before Trim() - ");
        System.out.println("String - "+ s3);
        System.out.println("Length - "+s3.length());

        s3=s3.trim();

        System.out.println("\nAfter Trim() - ");
        System.out.println("String - "+s3);
        System.out.println("Length - "+s3.length());


        String d = new String("hello");
        String c = new String("hello");


        System.out.println(d.equalsIgnoreCase(c)); // true\

        String abc    = "Abc".toLowerCase();
        boolean isAbc = "Abc".equalsIgnoreCase("ABC");


        String name1 = "Apple";
        String name2 = "APplE";

        if (name1.compareToIgnoreCase(name2) == 0){    // if (name1.equalsIgnoreCase( name2) )
            System.out.println(name1 + " is equal to " + name2);
        }else
            System.out.println(name1 + "is not equal to " + name2);




    }
}
