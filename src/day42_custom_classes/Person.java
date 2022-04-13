package day42_custom_classes;

public class Person {

    // these are instance variables
    String name;
    int age;
    double height;
    boolean isMarried;


    public void eat() {
        System.out.println(name+ "is eating");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", isMarried=" + isMarried +
                '}';
    }
}
