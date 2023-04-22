package exercises190423package;

/*
Write a program to print the area of a rectangle by creating a separate class named 'Rectangle'.
Class should contain getter and setter methods for length and breadth of rectangle. Also methods
for calculating area(S) and perimeter(P) of the rectangle. Length and breadth of rectangle are
entered through keyboard.( Scanner class)
 */


import java.util.Scanner;

public class Rectangle {
    int length, breadth;


    //Constructor
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int setLength(int x) {
        return (this.length = x);
    }

    public int setBreadth(int x) {
        return (this.breadth = x);
    }

    public int getLength() {
        return (this.length);
    }

    public int getBreadth() {
        return (this.breadth);
    }

    public int calculateArea() {
        return length * breadth;
    }

    public int calculatePerimeter() {
        return (length + breadth) * 2;
    }

    public static void main(String[] args) {
        System.out.println("Enter length: ");
        Scanner scanner = new Scanner(System.in);
        int firstResult = scanner.nextInt();
        System.out.println("Your entered length :" + firstResult + "\n");

        System.out.println("Enter breadth: ");
        int secondResult = scanner.nextInt();
        System.out.println("Your entered breadth :" + secondResult);

        Rectangle myObj = new Rectangle(firstResult, secondResult);
        System.out.println(myObj.calculateArea());
        System.out.println(myObj.calculatePerimeter());
    }
}
