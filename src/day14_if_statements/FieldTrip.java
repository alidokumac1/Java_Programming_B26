package day14_if_statements;
import java.util.Scanner;
public class FieldTrip {
    /*
    Create a class called FieldTrip.
Your school goes on a Field trip each year. The place you go will be based
on your grade. Based on the grade level (1-6) figure out the details of
your field trip. Print the information at the end.
declare and assign the grade level variable
only check for the data for valid grades which are only grades
values from 1-6. Less than 1 and more than 6 is invalid,
so print: "Grade must be between 1-6"
Data based on grade:
grade - 1
location -  Apple orchard
number of groups - 3
teacher in charge - Ms. Smith
grade - 2
location - Zoo
number of groups - 7
teacher in charge - Mr. Lee
grade - 3
location - Aquarium
number of groups - 5
teacher in charge - Ms. Wilson
grade - 4
location - Movie theater
number of groups - 2
teacher in charge - Ms. Reyes
grade - 5
location - Museum
number of groups - 5
teacher in charge - Ms. Lela
grade - 6
location - Six Flags
number of groups - 8
teacher in charge - Mr. Watt
------------------------------------------------------------------------
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the grade level");
        int gradeLevel = input.nextInt();

        int grade = 0, numberOfGroups = 0;
        String location = " ", teacherInCharge = " ";
        boolean isValid = true;


        if (gradeLevel >= 1 && gradeLevel <= 6) {
            if (gradeLevel == 1) {
                grade = 1;
                location = "Apple orchard";
                numberOfGroups = 3;
                teacherInCharge = "Ms. Smith";
            } else if (gradeLevel == 2) {
                grade = 2;
                location = "Zoo";
                numberOfGroups = 7;
                teacherInCharge = "Mr. Lee";
            } else if (gradeLevel == 3) {
                grade = 3;
                location = "Aquarium";
                numberOfGroups = 5;
                teacherInCharge = "Ms. Wilson";


            } else if (gradeLevel == 4) {
                grade = 4;
                location = "Movie theater";
                numberOfGroups = 2;
                teacherInCharge = "Ms. Reyes";


            } else if (gradeLevel == 5) {
                grade = 5;
                location = "Museum";
                numberOfGroups = 5;
                teacherInCharge = "Ms. Lela";


            } else if (gradeLevel == 6) {
                grade = 6;
                location = "Six Flags";
                numberOfGroups = 8;
                teacherInCharge = "Mr. Watt";


            } else {
                System.out.println("No available houses");
                isValid = false;
            }
            if (isValid) {

                String ad = "Data Based on Grade: \nGrade: " + grade + "\nLocation: " + location + "\n Number Of Groups:" + numberOfGroups;
                ad += "\n Teacher Name: " + teacherInCharge;
                System.out.println(ad);

            }
            } else {
                System.out.println("Invalid number ");
            }
        }
    }
