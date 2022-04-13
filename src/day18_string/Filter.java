package day18_string;

import java.util.Locale;
import java.util.Scanner;

public class Filter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a message");
        String message = input.nextLine().toLowerCase().trim();
//        message = message.toLowerCase();  these are the same thing with above
//        message = message.trim();

//        boolean validStart = message.contains("fun");
//        boolean validEnd = message.contains("bad") || message.contains("crying") || message.contains("contains");

        if (message.contains("java is bad") || message.contains("quit") || message.contains("have fun") || message.contains("crying")){
            System.out.println("Message failed to send");
        }else{
            System.out.println("\"" + message + "\"" + " was sent");
        }

        }


    }

