package day47_encapsulation.road;

public class TrafficLight {

    private String color;

    public TrafficLight(String color) {
        setColor(color);
    }

    public void setColor(String color) {
        switch (color.toLowerCase()){
            case "red":
            case "yellow":
            case "green":
                this.color = color;
        }
    }

    public String getColor() {
        return color;
    }
}
