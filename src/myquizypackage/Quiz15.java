package myquizypackage;

public class Quiz15 {
//    private static final int ON = 1;
//    private static final int OFF = 0;


    public static void main(String[] args) {
//        int x = 60;
//        int y = 90;
//        if (y % x == 0 && y - x == 30) {
//            System.out.println("Hello World");
//        } else {
//            System.out.println("Error");
//        }


        //What will be the output
//        int i = 0;
//        if (( i++ + i) > 2) {
//            System.out.println("I = " + i);
//    }


//        int a = 2, b = 3;
//        if (a >= b) {
//            if (b == 3)
//                System.out.print("===============");
//            else
//                System.out.print("#################");
//        }
//        System.out.print("&&&&&&&&&&&");

//        int a = 2, b = 3;
//        if (b >= a)
//            if (b == 3)
//                System.out.print("===============");
//            else
//                System.out.print("#################");
//        System.out.print("&&&&&&&&&&&");

//        for (int i = 1; 10 > i; i++) {
//            System.out.print(i + " ");
//            i++;
//        }

//        for(int i = 0; i < 9; i = i + 3)
//            System.out. print("foo");

//        for (int i = 0; i <= 10; i = i + 2) {
//            System.out.println(i);
//        }

//        double temp = 56.0;
//        if (temp < 54.0 && temp>40)
//            System.out.println("It is too hot");
//        else if ( temp < 40 || temp > 30)
//            System.out.println("It is hot but not too much");
//        else
//            System.out.println("It is pleasant");
//
//

//        int marks = 80;
//
//        if( marks > 70 ){
//            System.out.println("Distinction");
//        System.out.println("Congratulations");}
//        else if( marks > 35 )
//            System.out.println("Pass");

//        int count = 0;
//        while (count < 10) {
//            System.out.println("Welcome to Java");
//            count++;
//        }

//        int a = 0;
//        while(a < 10) {
//            System.out.println(a++);
//        }

//        int a = 0;
//        while(a + 2 < 10){
//            a += 2;
//            int b = 10;
//            while(b - 2 > 0){
//                b -= 2;
//            }
//        }
//        System.out.println(a + " " + b);

//        int i = 1;
//        switch (i) {
//            default:
//                System.out.println("Default ");
//            case 1:
//                System.out.println("1 ");
//                break;
//            case 0:
//                System.out.println("0 ");

//        int state = 1;
//        switch(state){
//
//            case ON:
//                System.out.println("On");
//                break;
//
//            default:
//                System.out.println("Unknown");
//
//            case OFF:
//                System.out.println("Off");


//        final int ON = 1;
//        final int OFF = 0;
//
//        int state = 1;
//
//        switch (state) {
//            case ON:
//                System.out.print("On");
//                break;
//
//            case OFF:
//                System.out.print("Off");
//
//            default:
//                System.out.print("Unknown");

//
//        int year = 2004;
//        switch(year){
//            case 2001: case 2002 : case 2003: case 2004: case 2005:
//                System.out.print("Normal Year");
//                break;
//            case 2004:
//                System.out.print("Leap Year");
//                break;





        int marks[] = {80, 20, 10, 5};
        int[] newMarks = new int[3];


       /* newMarks[0] = marks[80];
        newMarks[1] = marks[20];
        newMarks[2] = marks[10];
        newMarks[3] = marks[5];*/

        for (int i = 0; i < marks.length; i++) {
//          System.out.println("initial value " + newMarks[i]);


            newMarks[i] = marks[i];
//          System.out.println("after assignment value" + newMarks[i]);

//            for (int i = 0; i < marks.length; i++) {
//                System.out.println("initial value " + newMarks[i]);


            int [] lessThenValue = new int[3];



            for (int mark : newMarks) {
                System.out.println("values are" + mark);

            }
        }
    }
}

