package day09_scanner;

public class Discount {
    public static void main(String[] args) {

        boolean isWeekend = false;
        boolean teacher = false;
        boolean police = true;
        boolean fireFighter = false;


        boolean getDiscount =  isWeekend &&
                ( teacher || police || fireFighter);

        System.out.println(getDiscount);



        boolean isRaining = false;
        int temperature = 60;

        System.out.println(!isRaining && temperature >70); // !false -> true






    }
}
