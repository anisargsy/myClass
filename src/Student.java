
//Create a Student class with 3 variables, parameterized constructor, and 2 methods*
public class Student {
    String studentName;
    String studentLastName;
    int studentAge;

    public Student(String studentName, String studentLastName, int studentAge) {
        this.studentName = studentName;
        this.studentLastName = studentLastName;
        this.studentAge = studentAge;
    }

    public int getAge() {
        return studentAge;
    }

    public String getStudentName() {
        return studentName;
    }
}

class  ToExecute{

    public static void main(String[] args) {
        Student myObj = new Student("John", "Snow", 18);
        System.out.println(myObj.getAge());
        System.out.println(myObj.getStudentName());

    }
}