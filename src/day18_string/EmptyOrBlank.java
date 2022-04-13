package day18_string;

public class EmptyOrBlank {
    public static void main(String[] args) {


        String str = "last example";
        System.out.println(str.isEmpty());


        str = "";
        System.out.println(str.isEmpty());

        String s = " ";
        System.out.println("s is empty: " +s.isEmpty());
//

        System.out.println("s is blank: " +s.isBlank());

        String s2 = "        ";
        System.out.println(s.isEmpty());
        System.out.println(s.isBlank());

    }
}
