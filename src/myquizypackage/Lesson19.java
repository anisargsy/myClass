package myquizypackage;

public class Lesson19 {
    int outerA = 3;

    static int getMAx(int x, int y) {
        int maxvalue = x;
        return (y > x) ? y : x; // pay attention
    }

    public static void main(String[] args) {
        int a = getMAx(5, 6);
        System.out.println("Max value is:" + " " + a);


    }}
