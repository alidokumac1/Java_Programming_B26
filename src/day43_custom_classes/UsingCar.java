package day43_custom_classes;

public class UsingCar {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.model = "Chiron";
        car1.color = "black";
        car1.year = 2022;
        car1.fuelLevel = 80;

        System.out.println(car1);

        System.out.println();
        car1.drive(2);
        car1.drive(10);
        System.out.println(car1.fuelLevel);
        car1.fillTank();
        System.out.println(car1.fuelLevel);
    }

}
