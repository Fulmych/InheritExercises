package se.lexicon;

public class Car extends Vehicle{
    int numberOfDoors;
    int numberOfPassengers;

    @Override
    void drive() {
        System.out.println("Car is driving.");
    }
}
