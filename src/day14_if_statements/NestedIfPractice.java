package day14_if_statements;

public class NestedIfPractice {
    public static void main(String[] args) {

        int age = 121;



        if (age < 0 && age >120) {


        }if (age <=2 && age > 0 ){
            System.out.println("Babby");
        }else if (age >= 3 && age <= 5) {
            System.out.println("Toddler");
        }else if (age >=6 && age <= 9){
            System.out.println("Kid");
        }else if (age >= 10 && age <= 12){
            System.out.println("Pre-Teen");
        }else if (age >= 13 && age <= 17){
            System.out.println("Teenager");
        }else if (age >= 18 && age <= 20){
            System.out.println("Young Adult");
        }else if (age >=21 && age <= 35){
            System.out.println("Adult");
        }else if (age >= 36 && age <= 55){
            System.out.println("Middle-Aged Adult");
        }else if (age > 55){
            System.out.println("Senior Citizen");
        }else {
            System.out.println("Invalid age");
        }









    }
}
