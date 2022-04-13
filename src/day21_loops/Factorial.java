package day21_loops;

public class Factorial {

    public static void main(String[] args) {



    int n = 5;
    int result = 1;

    while (n > 1){
        System.out.println(result + " * " + n);
        result *=n;
        n--;
    }
        System.out.println(result);


}
 }