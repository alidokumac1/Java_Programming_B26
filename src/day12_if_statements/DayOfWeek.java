package day12_if_statements;

import java.time.MonthDay;

public class DayOfWeek {
    public static void main(String[] args) {


      //  int day = 4;

//        boolean monday = day == 1;
//        boolean tuesday = day == 2;
//        boolean wednesday = day == 3;
//        boolean thursday = day == 4;
//        boolean friday = day == 5;
//        boolean saturday = day == 6;
//        boolean sunday = day == 7;

        //String grade;

//        if (day==1){
//            grade ="Monday";
//        }else if (day==2)
//            grade = "Thursday";

        int day = 4;
        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid day number");
        }


    }
}
