package PracticeExtra;

import java.util.Scanner;

public class triangle {



        public static void triangleOrCircle(int angle1, int angle2, int angle3) {
            int sum = angle1 + angle2 + angle3;
            if (sum == 180) {
                System.out.println("This is a triangle.");
            } else if (sum == 360) {
                System.out.println("This is a circle.");
            } else {
                System.out.println("This is neither circle nor triangle.");
            }
        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Please, enter the size of 3 angles separated by \"Enter\":");
            int angle1 = input.nextInt();
            int angle2 = input.nextInt();
            int angle3 = input.nextInt();
            triangleOrCircle(angle1, angle2, angle3);
        }
    }
