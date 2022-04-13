package day18_string;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Locale;

public class UpperAndLower {
    public static void main(String[] args) {

        String str = "sNow";

        System.out.println(str.toUpperCase());

        System.out.println(str.toLowerCase());

        System.out.println(str);

        String word = "HELLO";
        word = word.toLowerCase();
        System.out.println(word);

        int a = 4;
        a++;
        a += 5;

        System.out.println(a);

        String word2 = word + "WORLD";
        System.out.println(word2);
        System.out.println(word);

        word += "neW text";
        System.out.println(word);

        System.out.println(word.toLowerCase());

    }
}
