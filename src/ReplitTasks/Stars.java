package ReplitTasks;

public class Stars {

    public static void main(String[] args) {


        for (int i = 0; i <= 9; i++) {

            for (int j = 0; j <= 8; j++) {

                System.out.print("  *  ");


            }
            System.out.println("");
        }


        System.out.println("=======================");


        String s = "**********";

        for (int i = 0; i < s.length(); i++) {

            for (int j = 0; j <= i; j++) {

                System.out.print(s.charAt(j));

            }
            System.out.println();



        }
    }
}