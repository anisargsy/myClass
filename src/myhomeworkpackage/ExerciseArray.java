package myhomeworkpackage;

import java.util.Arrays;
import java.util.Scanner;

/*Exercise: Array Max and Min
Write a program that takes an array of integers as input from the user,
and then calculates and displays the maximum and minimum values in the array.
Here's an outline of the steps to complete this exercise:

Declare and initialize an array of integers.
Use a loop to prompt the user to enter each element of the array and store them in the array.
Initialize variables to keep track of the maximum and minimum values.
Use another loop to iterate through the array and update the maximum and minimum values.
Display the maximum and minimum values to the user.*/
public class ExerciseArray {
    public static void main(String[] args) {
        int[] user = {30, 10, 80, 20, 32, 41};
        int n = user.length;
        int newArr[] = new int[n + 1];
        Scanner myScanner = new Scanner(System.in);
        System.out.println("User enter integer: " );
        int value = myScanner.nextInt();
        for(int i = 0; i<n; i++) {
            newArr[i] = user[i];
        }
        newArr[n] = value;
        System.out.println(Arrays.toString(newArr));

        int max = user[0];
        int min = user[0];

        for (int element : user) {
            if (element > max) {
                max = element;
            }
            if (element < min) {
                min = element;
            }
        }
        System.out.println(max);
        System.out.println(min);

    }

}
