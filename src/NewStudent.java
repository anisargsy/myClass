public class NewStudent {
    String name;
    int section;
    int marks;

    public NewStudent(String name, int section, int marks) {
        this.name = name;
        this.section = section;
        this.marks = marks;
    }

    public NewStudent(String name, int section) {
        this(name, section, 0);

    }

    public NewStudent(String name) {
        this(name, 0, 0);
    }

    public NewStudent() {
        this("", 0, 0);
    }

    public static void main(String arg[]) {
        NewStudent yogesh = new NewStudent("Yogesh", 67, 'B');
        NewStudent narayan = new NewStudent("Narayan", 72);
        NewStudent mahesh = new NewStudent("Mahesh");
        NewStudent kiran = new NewStudent();
        System.out.println("Name = " + yogesh.name + ", section = " + yogesh.section + ", marks = " +
                yogesh.marks);
        System.out.println("Name = " + narayan.name + ", section = " + narayan.section + ", marks = "
                + narayan.marks);
        System.out.println("Name = " + mahesh.name + ", section = " + mahesh.section + ", marks = "
                + mahesh.marks);
        System.out.println("Name = " + kiran.name + ", section = " + kiran.section + ", marks = " +
                kiran.marks);
    }
}

