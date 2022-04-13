package day35_methods;

import my_utilities.StringUtil;// className.method()
//import my_utilities.*; is wildcard. it will import all classes in the defined package

//import java.util.*; you can access Scanner or Arrays classes

public class UsingStringUtil {

    public static void main(String[] args) {

        System.out.println(StringUtil.reverse("apple"));

        System.out.println(StringUtil.fixFormat("jaMes"));


        System.out.println(StringUtil.frequencyOfCharacter("apple" , 'p'));

        System.out.println(StringUtil.uniqueCharacters("aaaaaabcccd"));

        System.out.println(StringUtil.uniqueCharacters("java"));

        System.out.println(StringUtil.uniqueCharacters("apple"));

    }

    }


