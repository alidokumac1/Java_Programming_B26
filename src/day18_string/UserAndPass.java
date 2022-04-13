package day18_string;

import java.util.Scanner;

public class UserAndPass {
    public static void main(String[] args) {

//        create a class UserAndPass
//ask the user to enter a username and password. Check if they are valid
//        based on the following requirements:
//        - The password cannot be less than 5 characters
//        If it is less print: "Password cannot be less than 5 characters"
//        If it is more than or equal to 5 print: "Valid password"
//                - Also, the password should not contain the username
//        If the password has the username in it print: "Invalid password,
//        username should not be in it" and in that case change the password to have
//        the value: "password"
//        Print the information in the end

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the user name");
        String user = input.next().toLowerCase();
        System.out.println("Enter the password");
        String password = input.next().toLowerCase();

        boolean isContain = password.contains(user);



        if (password.length() >= 5 && !isContain){
          System.out.println("Valid Password " + user);
      }else{
          if (password.length() < 5){
              System.out.println("Password cannot be less than 5 characters");
          }if (isContain){
                System.out.println("invalid password username should not be in it ");
            }
      }








    }
}
