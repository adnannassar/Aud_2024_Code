package Allgemein.ToStringExample;

public class Car {
    String model;
    double speed;

    public Car(String model, double speed) {
        this.model = model;
        this.speed = speed;
    }

    @Override
    public String toString() {
       return "Model: " + model +", Top Speed: " + speed;
    }
}
