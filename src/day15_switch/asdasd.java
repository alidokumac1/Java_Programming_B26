package day15_switch;

public class asdasd {

    public static void main(String[] args) {
        String item = "Blanket";
        int giftCard = 100;
        int price = 0;
        int balance = giftCard - price;


        switch (item){

            case "Blanket":
                int inventory = 2;
                price = inventory * price;

                break;
            case "Apple":
                price = 12;


            default:

                System.out.println("Invalid item");

        }
        System.out.println(balance);
    }
}
