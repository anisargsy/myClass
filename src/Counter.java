class Counter {
    static int count = 0;
    Counter() {
        count++;
    }
    public static void main(String srt[]) {
        Counter c1 = new Counter();
        Counter c3 = new Counter();
        Counter c4 = new Counter();
        System.out.print(c1.count);
    }
}