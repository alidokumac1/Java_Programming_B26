package day20_string;

public class Middle {

    public static void main(String[] args) {

        String s = "Elephant";


        int stringLength = s.length() ;

        int middle = stringLength/2 ;

        char c = s.charAt(middle + 1);


        System.out.println(c);

        String word = "Java";

        System.out.println(word.length());

    }
}
