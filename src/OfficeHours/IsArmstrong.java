package OfficeHours;

public class IsArmstrong {
    public static void IsArmstrong(int number){
        String printResult = "Armstrong numbers from 1 to " + number + ": ";

        for(int num = 1; num <= number; num++){
            String res = "" + num;
            int sum = 0;
            int multiply = 1;
            int [] parse = new int[res.length()];
            for (int i = 0; i < parse.length; i++) {
                parse[i] = Integer.parseInt(res.charAt(i) + "");

                for (int j = 0; j < parse.length; j++) {
                    multiply *= parse[i];
                }


                sum += multiply;
                multiply = 1;
            }
            if(sum == num){
                printResult += num + "; ";
            }
        }

        System.out.println("\n----------RESULT----------");
        System.out.println(printResult);
    }

    public static void main(String[] args) {
        IsArmstrong(10000);
    }
}
