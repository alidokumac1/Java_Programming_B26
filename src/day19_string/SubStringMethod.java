package day19_string;

public class SubStringMethod {

    public static void main(String[] args) {

        String str = "sunday";


        System.out.println(str.substring(1));
        System.out.println(str.substring(3));
        System.out.println(str);
        System.out.println("satur" + str.substring(3));

        System.out.println(str.substring(2, 4));
        System.out.println(str.substring(0, 5));
        System.out.println(str.substring(0,6));
       // System.out.println(str.substring(0,7));


        String str1 = "apple";
        String str2 = "banana";

        System.out.println(str1.substring(1));
        System.out.println(str2.substring(0,str.length() -1));


    }
}
