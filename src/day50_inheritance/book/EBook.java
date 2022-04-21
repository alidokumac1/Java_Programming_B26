package day50_inheritance.book;

import day50_inheritance.book.Book;

public class EBook extends Book {

    double size;
    int pages;

    public void read(){

        System.out.println("Reading a digital copy of " + title);

    }



}
