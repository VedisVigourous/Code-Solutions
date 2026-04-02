/*
 * Day 13: Abstract Classes
 * Link: https://www.hackerrank.com/challenges/30-abstract-classes
 * Difficulty: Easy
 * Language Used: Java 15
 *
 */

import java.io.*;
import java.util.*;

abstract class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}

class MyBook extends Book {
    int price;

    MyBook(String title , String author , int price){
        super(title , author);
        this.price = price;
    }

    void display(){
        System.out.printf("Title: %s\n" , title);
        System.out.printf("Author: %s\n" , author);
        System.out.printf("Price: %d\n" , price);
    }
}
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}