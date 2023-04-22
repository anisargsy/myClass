//Create a class called Dog that has instance variables for name, breed, and age.
// Add a method called getBreed that returns the dog's breed.
public class Dog {
    String name;
    String breed;
    int age;

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
    public String getBreed(){
        return breed;
    }

    public static void main(String[] args) {
        Dog myObj = new Dog("Joni", "Bigle",40 );
        System.out.println(myObj.breed);
    }
}
