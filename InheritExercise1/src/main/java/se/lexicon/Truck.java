package se.lexicon;

public class Truck extends Vehicle{
    int maxWeight;
    int numberOfWheels;

    @Override
    void drive() {
        System.out.println("Truck is driving.");
    }
}
