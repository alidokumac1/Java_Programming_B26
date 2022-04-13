package day37_wrapper_arraylist;

public class GoogleSearch {

    public static void main(String[] args) {

        String result = "About 2,550,000,000 results (3.00 seconds)";


        String [] arr = result.split(" ");
        String resultStr = arr [1].replace(",","");
        String timeStr = arr[3].substring(1);


        System.out.println(resultStr);
        System.out.println(timeStr);


      long resultNumber  = Long.parseLong(resultStr);
      double timeNumber = Double.parseDouble(timeStr);

        System.out.println(resultNumber);
        System.out.println(timeNumber);

        if (resultNumber >= 0){
            System.out.println("Test Case Passed - Positive Number");
        }else {
            System.err.println("Not Passed");
        }

        if (timeNumber <= 2 && timeNumber >= 0){
            System.out.println("Test Case Passed - Under 2 seconds");
        }else {
            System.err.println("Failed");
        }







    }

}
