package day48_encapsulation;

public class Square {


    private int side;


    public Square(int side) {
        setSide(side);


    }

    public int getSide() {
        return side;
    }

    // cannot do obj.side anymore
    // do obj.getSide()

    public void setSide(int side) {
         if (side > 0){
             this.side = side;

         }
    }

    // can't do obj.side = value
    // do obj.setSide(value)

    public int calculateArea(){

        return side * side;
    }

    public int calculatePerimeter(){
        return side * 4;

    }

    public String toString(){
        return "Side of Square: " + side + " | Area: " + calculateArea() + " | Perimeter: " + calculatePerimeter();
    }
}
