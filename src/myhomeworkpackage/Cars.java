package myhomeworkpackage;

public class Cars {
    String model;
    int year;
    int maxSpeed;

    public Cars(String model, int year, int maxSpeed) {
        this.model = model;
        this.year = year;
        this.maxSpeed = maxSpeed;
    }

    public void getMaxSpeed() {
        if (maxSpeed >= 250) {
            System.out.println("Model:" + " " + model + "\nYear:" + " " + year + "\nMax Speed:" + " " + maxSpeed + "\nSport Car\n");
        } else {
            System.out.println("Model:" + " " + model + "\nYear:" + " " + year + "\nMax Speed:" + " " + maxSpeed + "\nCity Car\n");
        }
    }

    public static void main(String[] args) {
        Cars myObj1 = new Cars("Ford", 10, 200);
        Cars myObj12 = new Cars("BMV", 20, 250);
        myObj1.getMaxSpeed();
        myObj12.getMaxSpeed();
    }

}
