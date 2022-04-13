package day14_if_statements;

public class Practice {

    public static void main(String[] args) {

        /*

Declare and assign these variables: Citizenship(boolean), resident (boolean), and has high school diploma (boolean), and age(int). Determine if the person is qualified to join the army.

	- The person must be a citizen or a resident
		-> If not print: You must be a citizen or a resident
	- Their age must be between 18 and 35
		-> If not print: Your age must be between 18 to 35 years old
	- They must have a high school diploma
		-> If not print: You must have a high school diploma

	> If all the criteria is met print: You are qualified for the Army
         */

        int age = 25;
        boolean citizenShip = true, resident = true, hasDiploma = false;

        boolean isQualified = (age >= 18 && age <= 35) && citizenShip && resident && hasDiploma;


        if (isQualified) {
            System.out.println("You are qualified for the Army");
        } else {
            if (!(age >= 18 && age <= 35)) {
                System.out.println("Your age must be between 18 to 35 years old");
            }
            if (!citizenShip || !resident) {
                System.out.println("You must be a citizen or a resident");
            }
            if (!hasDiploma) {
                System.out.println("You must have a high school diploma");
            }


        }}}

