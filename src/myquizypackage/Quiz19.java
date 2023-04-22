package myquizypackage;

public class Quiz19 {
//    static int a = 20;
//    Quiz19() {
//        a = 200;
//    }
//    public static void main(String[] args) {
//        new Quiz19();
//        System.out.println(a);
//    }

//
//    static {
//        System.out.println("static block");
//    }
//    {
//        System.out.println("instance block");
//    }
//    public static void main(String[] args) {
//        Quiz19 obj = new Quiz19();
//        Quiz19 obj2 = new Quiz19();
//        Quiz19 obj3 = new Quiz19();
//    }

//
//    private static int x = 10;
//    static {
//        x++;
//    }
//    static {
//        ++x;
//    }
//    {
//        x--;
//    }
//    public static void main(String[] args) {
//        Quiz19 obj = new Quiz19();
//        Quiz19 obj2 = new Quiz19();
//        Quiz19 obj3 = new Quiz19();
//        System.out.println(x);
//    }

    static int a = 20;
    static int b = 30;
    static int c = 40;
    Quiz19()
    {
        a = 200;
    }
    static void m1() {
        b = 300;
    }
    static {
        c = 400;
    }
    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        Quiz19 m = new Quiz19();
        Quiz19.m1();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


    }
}







