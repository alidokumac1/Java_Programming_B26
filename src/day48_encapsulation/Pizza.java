package day48_encapsulation;

public class Pizza {

    private String size;
    private int numberOfTopping;


    public Pizza(String size , int numberOfTopping){

        setSize(size);
        setNumberOfTopping(numberOfTopping);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium") || size.equalsIgnoreCase("large")) {
            this.size = size;
        }
    }

    public int getNumberOfTopping() {
        return numberOfTopping;
    }

    public void setNumberOfTopping(int numberOfTopping) {
        if (numberOfTopping >= 0) {
            this.numberOfTopping = numberOfTopping;
        }
    }

    public double calculatePrice(){
        if (size == null){
            return -1;
        }

        double price = size.equalsIgnoreCase("small") ? 4 : size.equalsIgnoreCase("medium") ? 6 : 8;

        return price + (numberOfTopping * 0.75);
    }

    public  String toString(){

        return  "Pizza size: " + size + ", number of toppings: " + numberOfTopping + ", price: $" + calculatePrice();
    }
}

