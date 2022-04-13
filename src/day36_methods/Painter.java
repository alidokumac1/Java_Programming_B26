package day36_methods;

public class Painter {
    public static void main(String[] args) {


        Picture.draw();
        Picture.draw(100);
        Picture.draw("red");
        Picture.draw("Blue", "green");

        String s = "200";
        Picture.draw(s);


        Picture.draw("red",1);

        Picture.draw(100,"blue");


    }
}
