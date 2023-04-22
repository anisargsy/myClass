//Write a Mobile class to define the member variables - model,
// numberOfSims, memory and hasCamera. Also define a constructor which takes these four parameters.
public class Mobile {
    String model;
    int numberOfSims;
    double memory;
    boolean hasCamera;

     Mobile(String model, int numberOfSims, double memory, boolean hasCamera) {
        this.model = model;
        this.numberOfSims = numberOfSims;
        this.memory = memory;
        this.hasCamera = hasCamera;
    }
}
