package exercises190423package;

import java.util.Scanner;

/*
Write a program to print the area and perimeter of a triangle by creating a class named 'Triangle'
with 3 parameters in its constructor.( in separate class ). Triangle sides are entered through
keyboard. Also check in the constructor that valid values are passed( Scanner class)

 */
public class Triangle {
    int a, b, c;

    //constructor
    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public int getPerimeter() {
        return (a + b + c);
    }

    public double getArea() {
        int s = getPerimeter() / 2;
        double areaTriangle = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return areaTriangle;
    }


    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int firstParameter = myScanner.nextInt();
        System.out.println("You enter value 1: " + firstParameter);

        int secondParameter = myScanner.nextInt();
        System.out.println("You enter value 2: " + secondParameter);

        int threeParameter = myScanner.nextInt();
        System.out.println("You enter value 3: " + threeParameter);

        Triangle perimeter = new Triangle(firstParameter, secondParameter, threeParameter);
        System.out.println(perimeter.getPerimeter());
        System.out.println(perimeter.getArea());



    }

}
