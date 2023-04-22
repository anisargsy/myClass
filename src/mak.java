import java.util.Arrays;
import java.util.Scanner;

public class mak {


    /*public static void main(String[] args) {
        int[] number = {1, 3, 8};
        int test = number.length;
        System.out.println(test);

        int[] number1 = {4, 7, 8};
        int test1 = number1.length;
        System.out.println(test1);


        int result = test + test1;
        int[] number3 = new int[result];
        System.out.println(result);

        for (int i = 0; i < number.length; i++) {
            number3[i] = number[i];

        }
        for (int i = 0; i < number1.length; i++) {
            number3[number.length + i] = number1[i];

        }
        System.out.println(Arrays.toString(number3));*/

    /*Write a program that takes two numbers as input and prints their sum, difference, product, and quotient.*/

    int x;
    int y;

    //constructor
    public mak(int x, int y) {
        this.x = x;
        this.y = y;
    }

//    public static String getEvenOddNumber(int x) {
//        if (x % 2 == 0) {
//            return "Odd";
//        } else {
//            return "Even";
//        }
//
//    }

//    public static void getOdd  (int x) {
//        for (int i = 2; i < x; i += 2) {
//            System.out.println(i);
//        }
//
//    }

    public static boolean getNumber(int y) {
        boolean x = true;
        for (int i = 2; i < y / 2; i++) {
            if (y % i == 0) {
                x = false;
                break;
            } else {
                x = true;

            }
        }
        return x;

    }


    public static void main(String[] args) {
//        System.out.println("Enter first number:");
//        Scanner scanner = new Scanner(System.in);
//        int firstNumber = scanner.nextInt();
//        System.out.println("Enter second number:");
//        int secondNumber = scanner.nextInt();
//        System.out.println("You counted two numbers sum");
//        System.out.println(firstNumber + secondNumber);
//
//
//        System.out.println("You counted two numbers multiply");
//        System.out.println(firstNumber * secondNumber);
//
//        System.out.println("You counted two numbers difference");
//        System.out.println(firstNumber - secondNumber);

//        System.out.println(mak.getEvenOddNumber(6));

//        mak.getOdd(15);
        System.out.println( mak.getNumber(3));

    }


}





