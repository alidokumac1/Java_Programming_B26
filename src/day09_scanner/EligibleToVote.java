package day09_scanner;

public class EligibleToVote {

    public static void main(String[] args) {

        String name = "James B";
        boolean isCitizen = true;
        boolean hasCriminalBackGround = true;
         int age = 49;


         boolean isEligibleToVote = age >= 18 && isCitizen && isCitizen && !hasCriminalBackGround; // true && true && (!false -> true)


        System.out.println(name + "is eligible to vote: " + isEligibleToVote);








    }



}
