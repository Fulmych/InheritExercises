package se.lexicon;

public class Motorcycle extends Vehicle{
    String handle;
    String thickWheels;

    @Override
    void drive() {
        System.out.println("Motorcycle is driving.");
    }
}
