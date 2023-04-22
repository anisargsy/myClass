public class Point {
    int x;
    int y;

    public Point(int _x, int _y) {
        x = _x;
        y = _y;
    }

    public static void main(String[] args) {
        Point a = new Point(0, 5);
        a.printPointInfo();

        Point b = new Point(10, 15);
        b.printPointInfo();

        Point c = a;
//      Boolean ae = a != b;
        a.x = 20;
        c.printPointInfo();
        c.y = 35;
        a.printPointInfo();


    }

    void printPointInfo() {
        System.out.printf("X : %d, Y : %d \n\r", x, y);
    }
}
