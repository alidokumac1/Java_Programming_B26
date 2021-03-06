package day47_encapsulation.computer;

public class Computer {

    String brand;
    double price;
    String color;


    static boolean hasScreen;
    static  boolean hasBattery;
    static boolean hasMemory;

    static {
        System.out.println("Static block run");
        hasBattery = false;
        hasScreen = true;
        hasMemory = true;

    }

    public Computer(String brand, double price, String color) {
        System.out.println("Constructor run");

        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
