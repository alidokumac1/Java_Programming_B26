package day33_methods;

import java.util.Locale;
import java.util.Scanner;
import java.util.SortedMap;

public class Email {
    public static void buildEmail(String name , String domain){


        String email = name.substring(0,1);
        int space = name.indexOf(" ");
        email += name.substring(space + 1, space + 4); // gives the first three letters of the lastname
        email += "@" + domain.toLowerCase() + ".com";
        System.out.println(email);
    }

    public static void main(String[] args) {

        buildEmail("James bond", "Gmail");
        buildEmail("Anna Smith", "Yahoo");
        buildEmail("Ali Dokumaci","google");

    }



    }

