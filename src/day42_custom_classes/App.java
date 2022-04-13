package day42_custom_classes;

public class App {

    @Override
    public String toString() {
        return "App{" +
                "name='" + name + '\'' +
                ", version=" + version +
                ", isFree=" + isFree +
                '}';
    }

    String name;
    double version;
    boolean isFree;

    public void run(){
        System.out.println(name + " is running");
    }

    public void update(){
        System.out.println(name + " is updating");

        version += 1.1;
    }
}
