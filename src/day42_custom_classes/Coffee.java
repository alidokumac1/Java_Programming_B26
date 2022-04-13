package day42_custom_classes;

public class Coffee {
    /*
    Create a coffee class with these instance variables:

     price, size(oz), brand
     */

    String brand;
    double price;
    double size;
    String type;

    public String toString(){

        return type + " from " + brand + " size of  " + size + " oz. For a total price of " + price;
    }

    public void drink(){

        System.out.println("Drinking " + type);
       size -= 1.5;
    }
    public void refill(double amount){
        System.out.println("Refilling " + amount + " oz of coffee");

        size += amount;

}

/*
  public void refill(double size){
        System.out.println("Refilling " + size + " oz of coffee");

        size += size; // this updates the local size form the parameter, not the instance size

 */


    }


