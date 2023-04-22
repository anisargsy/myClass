package myhomeworkpackage;

import java.util.Scanner;

//Create a class called "Book" with properties "title", "author", and "year".
// Implement methods to display the details of the book.
public class GptBook {
    String title;
    String author;
    int year;

    public GptBook(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;

    }

    public String getInfo() {
        return ("Title:" + " " + title + " " + "\nAuthor:" + " " + author + " " + "\nYear:" + " " + year);

    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter book title");
        String firstString = myScanner.nextLine();
        System.out.println("You entered: " + firstString);

        System.out.println("Enter Author name");
        String secondString = myScanner.nextLine();
        System.out.println("You entered " + secondString);

        System.out.println("Enter Year: ");
        int inputInt = myScanner.nextInt();
        System.out.println("You entered " + inputInt);

        GptBook book = new GptBook(firstString, secondString, inputInt);
        System.out.println("All information about book:");
        System.out.println(book.getInfo());


    }


}
