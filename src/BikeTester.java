public class BikeTester {
    String company;
    String model;
    int cc;
    double mileage;
    boolean diskBrakes;

    public static void main(String s[]) {
        BikeTester bike = new BikeTester();
        bike.company = "Hero Honda";
        bike.model = "Shine";
        bike.cc = 150;
        bike.mileage = 12.5;
        bike.diskBrakes = true;
        System.out.println(bike.company + "'s " + bike.model + " gives a mileage of " + bike.mileage +
                "kmpl.");
    }
}

