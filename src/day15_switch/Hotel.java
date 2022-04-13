package day15_switch;
import java.util.Scanner;
public class Hotel {

    public static void main(String[] args) {

        /*
        Ask the user how many days they will stay at the hotel
Then ask the user how many people are in their party (how many people are staying in the room)

Use those two information to determine the price and room type for the hotel based on the below data:

	party size: 1
	room type: single room
	price: number of days * 100

	party size: 2
	room type: double room
	price: number of days * 125

	party size: 3 or 4
	room type: large room
	price: number of days * number of people * 150

	party size: 5, 6, or 7
	room type: suite
	price: number of days * 5000

	any other party size:
		Display one message:
			Sorry we don't have any available rooms for that size party

-----------------------------------------------------------
         */


        Scanner input = new Scanner(System.in);
        System.out.println(" How many days they will stay at the hotel?");
        int day = input.nextInt();
        System.out.println("How many people are staying in the room?");
        int people = input.nextInt();

        double price = 0;

        String type = " ";
        String partysize = " ";
        boolean validOrder = true;

        switch (people) {

            case 1:

                partysize = "1";
                type = "Single room";
                price = day * 100;

                break;
            case 2:
                partysize = "2";
                type = "Double room";
                price = day * 125;

                break;

            case 3:

                partysize = "3 or 4 ";
                type = "Large room";
                price = day * 150;
                break;

            case 4:

                partysize = " 5,6 or 7";
                type = "Suite";
                price = day * 5000;

                break;

            default:

                System.out.println("Sorry we don't have any available rooms for that size party");
                validOrder = false;


        }
        if (validOrder) {

            System.out.println("Party size : " + partysize + "\n type : " + type + " \n price : $" + price);


        }
    }
}











                //if (validOrder) {
                  //  System.out.println("Party size : " + partysize + "\n type : " + type + " \n price : $" + price);




