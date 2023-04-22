package exercises190423package;

import exercises190423package.Employee;

public class Address {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Robert", 2004, 2000, 8, "64C WallsStreet");
        System.out.println(employee1.address);
    }
}