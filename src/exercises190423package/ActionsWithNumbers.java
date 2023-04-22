package exercises190423package;
/*
Write a program to calculate the sum, difference and product of two numbers by creating a class
named 'ActionsWithNumbers' with separate methods for each operation. Numbers and action
types are entered by user.( make methods static)
 */


import java.util.Scanner;

public class ActionsWithNumbers {


    public static int calculateSum(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    public static int calculateDifference(int numberOne, int numberTwo) {
        return numberOne - numberTwo;
    }

    public static int calculateMultiply(int numberOne, int numberTwo) {
        return numberOne * numberTwo;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstParameter = scanner.nextInt();
        System.out.println("Enter first parameter: " + firstParameter);

        int secondParameter = scanner.nextInt();
        System.out.println("Enter first parameter: " + secondParameter);

        System.out.println(ActionsWithNumbers.calculateSum(firstParameter, secondParameter));
        System.out.println(ActionsWithNumbers.calculateDifference(firstParameter, secondParameter));
        System.out.println(ActionsWithNumbers.calculateMultiply(firstParameter, secondParameter));
    }

}
