package day47_encapsulation.road;

public class Road {

    public static void main(String[] args) {


        TrafficLight light = new TrafficLight("red");
        System.out.println(light.getColor());

        light.setColor("Yellow");

        System.out.println(light.getColor());

        TrafficLight light3 = new TrafficLight("Black");
        System.out.println(light3.getColor());
    }
}
