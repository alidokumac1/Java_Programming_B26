package OfficeHours;

public class goBackToTheMainDirectory {

    /*
     Number of Steps to Main directory  --- Interview Task

                 We have a record of every time a change of directory is performed.The different change directory functions are as follow ;

                     ../  Move to parent folder of current folder
                     ./   Remain in the same folder
                     x/   Move to the child folder named x


                     Write a method to Find the minimum steps required to go back to main directory from current folder.The squence of operations performed after entering the main directory provided


                     Input : {"x/","y/","../","z/","./"}

                     Output : 2
     */

    public static void goBackToTheMainDirectory(String [] arr){

        int count = 0;

        for (String s : arr) {
            if (s.charAt(0) == '.' && s.charAt(1) == '.') {
                count--;
            } else if (s.charAt(0) == '.' && s.charAt(1) != '.' || s.charAt(0) == '/') {
                continue;
            } else {
                count++;
            }
        }

        System.out.println("\n----------RESULT----------");
        System.out.println(count);
    }

    public static void main(String[] args) {
        String [] arr = {"x/","y/","../","z/","./"};
        goBackToTheMainDirectory(arr);
    }
}
