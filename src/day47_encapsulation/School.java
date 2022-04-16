package day47_encapsulation;

import day46_static.CydeoStudent;

public class School {

    public static void main(String[] args) {


        CydeoStudent Ali = new CydeoStudent("Ali", 5);
        System.out.println(Ali);

        System.out.println();
      CydeoStudent.printInfo();

        System.out.println();
      Ali.printInfo();

        System.out.println();

        System.out.println(CydeoStudent.instructors[0]);

        System.out.println();
        for (String each :CydeoStudent.instructors){
            System.out.println(each);
        }

    }
    }
