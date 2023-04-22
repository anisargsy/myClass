public class CarTester {
    String company;
    String model;
    int cc;
    double mileage;


    public static void main(String s[]) {
        Car car = new Car("Maruti", "Wagon R", 1000, 12.4);
        System.out.println(car.company + "'s " + car.model + " has engine power of " + car.cc + "cc.");
    }

}


