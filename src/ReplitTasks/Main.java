package ReplitTasks;

public class Main {

    public static void main(String[] args) {


    char CapitalChar = 'A';
    char SmallChar = 'a';

    //Find the ASCII Value from A-Z

       System.out.println("ASCII Value from 'A' to 'Z'");
       for(int i ='A'; i<='Z'; i++) {
        System.out.println(CapitalChar +" : "+i);
        CapitalChar++;




    }

        for (int i = 'a'; i < 'z'; i++ ){
            System.out.println(SmallChar +" : " + i);
            SmallChar++;
        }

    }}