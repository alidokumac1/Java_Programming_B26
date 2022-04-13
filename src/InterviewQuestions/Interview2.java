package InterviewQuestions;

public class Interview2 {

    public static void main(String[] args) {

        /**
         password should not capital letter
         lower case 4 char
         password needs to and with 2 aa
         */
//
//        String [] password = {"aasdaa"};
//
//        String pass = "ASDASDFaaa";
//
//        for (int i = 0; i <= password.length;i++){

        String pass = "Asaa";

        if (pass.length() < 6 && pass.endsWith("aa") && pass.charAt(0) > 50){
            System.out.println("Long in");
        }else {
            System.out.println("incorrect");
        }
//
//
//
            }
//
//            if (password.length == 4 && password.endsWith)
        }


