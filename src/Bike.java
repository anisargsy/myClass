public class Bike {
    boolean diskBrakes = false;
    double mileage = 72.5;
    String model;
    String company;

    public Bike(String model, String company, double mileage) {
    this.model = model;
    this.company = company;
    this.mileage = mileage;
    }

    public static void main(String s[]) {
        Bike bike = new Bike("Hero Honda", "Shine", 125);
        bike.mileage = 72.5;
        bike.diskBrakes = false;

        System.out.println(bike.company + "'s " + bike.model + " gives a mileage of " + bike.mileage
                + "kmpl.");
    }
}

