package day05_variables;

public class EmployeeInfo {


    public static void main(String[] args) {



        String firstName, lastName, companyName, jobTitle;
        char gender, suite;
        int age, numberOfPTO;
        double salary;
        boolean isFullTime, isMarried;

firstName = "Ali";
lastName = "Dokumaci";
companyName = "Surya";
jobTitle = "Product Development";
gender = 'M';
suite = 'D';
age = 40;
numberOfPTO = 15;
salary = 1_000_000; // 1,000,000

        isFullTime = true;
        isMarried = false;


        String fullDetails = "Employment information for " +firstName + " " + lastName  + ".\n" + jobTitle + " at " + companyName + " currently " + age + " years old. \n" + companyName + " is located in suite " + suite + ".  This years salary comes to $" + salary + ". \nOther details : \nPTO: " + numberOfPTO + "\nfull time? " + isFullTime + "\nmarried? " + isMarried;


        System.out.println(fullDetails);











    }
}
