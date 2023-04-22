package myhomeworkpackage;/*Create a class called "Student" with properties "name", "age", and "grade".
Implement methods to set and get the values of these properties.
Also, implement a method to display the details of the student.
 */

public class GptStudent {
    private String name;
    int age;
    int grade;

    //Constructor
    public GptStudent(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    //methods set
    public void setName(String name) {
        this.name = name;

    }

    public void setAge(int age) {
        this.age = age;

    }

    public void setGrade(int grade) {
        this.grade = grade;

    }

    //methods get
    public String getName() {
        return name;

    }

    public int getAge() {
        return age;
    }

    public int getGrade() {
        return grade;
    }

    //Methods detailsStudent
    public void detailsStudent() {
        System.out.println("Enter Student name: " + name);
        System.out.println("Enter Student age: " + age);
        System.out.println("Enter Student grade: " + grade);

    }

    public static void main(String[] args) {
        GptStudent myObj = new GptStudent("Anna", 17, 100);
        myObj.detailsStudent();
        myObj.setAge(10);
        myObj.detailsStudent();
        System.out.println(myObj.name);
        System.out.println(myObj.getName());
    }
}
