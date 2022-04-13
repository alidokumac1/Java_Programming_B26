package day43_custom_classes;

public class UseCarpet {
    public static void main(String[] args) {

        Carpet carpet1 = new Carpet(true, 8,10,3);
        System.out.println(carpet1);

        carpet1.length = 14;
        carpet1.width = 10;

        carpet1.calculatePrice();

        System.out.println(carpet1.totalPrice);

    }
}
