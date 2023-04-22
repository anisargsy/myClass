package myhomeworkpackage;/*Create a class called "Employee" with properties "name", "id", and "salary".
Implement methods to set and get the values of these properties.
 Also, implement a method to display the details of the employee.*/

public class GptEmployee {
    private String name;
    private int id;
    private double salary;

    // Constructor
    public GptEmployee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee salary: " + salary);
    }

    public static void main(String[] args) {
        // Creating an Employee object
        GptEmployee emp1 = new GptEmployee("John Doe", 1001, 50000.0);

        // Displaying employee details
        emp1.displayDetails();

        // Updating employee details using setter methods
        emp1.setName("Jane Smith");
        emp1.setId(1002);
        emp1.setSalary(55000.0);

        // Displaying updated employee details
        emp1.displayDetails();
    }
}





