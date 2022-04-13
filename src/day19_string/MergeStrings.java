package day19_string;


public class MergeStrings {
    public static void main(String[] args) {

//      String num1 = "abc", num2 = "xyz";
//
//        System.out.println("" + num1.charAt(0)+ "" + num2.charAt(0) + num1.charAt(1) + num2.charAt(1) + num1.charAt(2)  + num2.charAt(2)  );
//
//        //System.out.println("" + num2.charAt(num2.length() -1 ) +  );
//


        String a = "abc";
        String b = "XYZ";
        String merged = "";
        merged += a.charAt(0);
        merged += b.charAt(0);
        merged += a.charAt(1);
        merged += b.charAt(1);
        merged += a.charAt(2);
        merged += b.charAt(2);

        System.out.println(merged);


    }
}
