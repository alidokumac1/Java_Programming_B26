package day18_string;

public class RecapMethod {
    public static void main(String[] args) {


            String s = "pen";

            String s2 = new String("pen");

        System.out.println("Compare with == " + (s == s2 ));
        System.out.println("Compare with .equals() " +(s.equals(s2)));

        System.out.println(s.equals("Pen"));
        System.out.println(s.equalsIgnoreCase("Pen"));

boolean isSame = s.equalsIgnoreCase("PEN");

if (s.equals("PEN")){

}

int len = s.length();
        System.out.println(len);
        System.out.println("len = " + len);

        if (s.length() > 4 ){
            System.out.println("Long word");
        }else {
            System.out.println("Short word");
        }
        System.out.println("aaa".length());







    }
}
