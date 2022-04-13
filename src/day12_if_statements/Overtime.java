package day12_if_statements;

public class Overtime {

    public static void main(String[] args) {


        double hourlyRate = 20.5;
        double numberOfHours = 39;
        double netPay;
        String message;

        if (numberOfHours > 40) {

            double overtimeHours = numberOfHours - 40;
            netPay = 40 * hourlyRate;
            netPay += overtimeHours * hourlyRate * 1.5;
            message = "You worked " + numberOfHours + " hours at a rate of " + hourlyRate + " , but " + overtimeHours + " of the hours were overtime, so you got additional pay for those hours. Your net pay was $" +netPay;


        } else {
            // when the number of hours is less than or equal to 40 , we will run this code
            netPay = numberOfHours * hourlyRate;
            message = "You worked " + numberOfHours + " hours at a rate of " + hourlyRate + " there was no overtime. Your net pay was: $ " + netPay;


        }

        System.out.println(message );


    }
}
