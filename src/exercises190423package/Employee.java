package exercises190423package;

/*
Write a program that would print the information (name, year of joining, salary, workingHours,
address) of three employees by creating a class named 'Employee'. The output should be as
follows: Name Year of joining Salary Address Robert 2004 2000$ 64C
WallsStreet Sam 2020 1300$ 68D- WallsStreet. John 2019 1000k
26B- WallsStreet

 */
public class Employee {
    String name;
    int year;
    int salary;
    int workingHours;
    String address;

    //Constructor
    public Employee(String name, int year, int salary, int workingHours, String address) {
        this.name = name;
        this.year = year;
        this.salary = salary;
        this.workingHours = workingHours;
        this.address = address;


    }

    public String getEmployee() {
        return ("Name: " + name + " " + "\nYear of joining: " + year + " " + "\nSalary: " + salary + "$" + " " + "\nWorkingHours: " + workingHours + " " + "\nAddress: " + address + "\n");

    }

    /*
    Write a program by creating an 'Employee' ( in addition to previous question) class having the
following methods and print the final salary. 1 - 'getInfo()' which takes the salary, number of hours
of work per day of employee as parameter 2 - 'AddSal()' which adds $10 to salary of the
employee if it is less than 1100. 3 - 'AddWork()' which adds $5 to salary of employee if the
number of hours of work per day is more than 6 hours
     */

public String getInfo(){
    return ("WorkingHours: " + workingHours + " " +"\nSalary: " + salary);
}

    public int addSal(){
        if(salary < 1100){
            return (salary = salary + 10);
        } else {
            return salary;
        }
    }


    public int addWork(){
        if(workingHours > 6){
            return (salary = salary + 5);
        } else {
            return salary;
        }
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Robert", 2004, 2000, 8, "64C WallsStreet");
        Employee employee2 = new Employee("Sam", 2020, 1000, 4, "68D- WallsStreet");
        Employee employee3 = new Employee("John",2019, 400, 2, "1000k 26B- WallsStreet");

        System.out.println(employee1.getEmployee());
        System.out.println(employee2.getEmployee());
        System.out.println(employee3.getEmployee());


        System.out.println(employee1.addSal());
        System.out.println(employee1.addWork());
        System.out.println(employee1.getInfo());

    }
}
