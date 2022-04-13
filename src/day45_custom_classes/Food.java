package day45_custom_classes;

public class Food {

    String name;
    int qty;
    double unitPrice;
    double totalPrice;

    public Food(String name) {
        this.name = name;
    }

    public Food(String name, int qty) {
        this.name = name;
        this.qty = qty;
    }

    public Food(String name, int qty, double unitPrice) {
        this(name, qty);

        this.unitPrice = unitPrice;
        calculatePrice();
    }

    public void calculatePrice(){

        totalPrice = unitPrice * qty;


    }

    public String toString(){
        return "item: " + name + "~" + qty + " x " + unitPrice + " for $ " + totalPrice;
    }
}
