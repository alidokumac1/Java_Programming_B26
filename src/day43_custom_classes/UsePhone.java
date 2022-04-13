package day43_custom_classes;

public class UsePhone {

    public static void main(String[] args) {


        Phone phone1 = new Phone("Iphone X");
        System.out.println(phone1);

        Phone phone2 = new Phone("Iphone 12", "Apple");
        System.out.println(phone2);

        Phone iphone3 = new Phone("Galaxy s 22","Samsung", 128,10.2);
        System.out.println(iphone3);


    }
}
