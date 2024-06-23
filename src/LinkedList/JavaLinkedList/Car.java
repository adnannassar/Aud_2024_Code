package LinkedList.JavaLinkedList;

public class Car implements Comparable<Car> {
    String model;
    double speed;

    public Car(String model, double speed) {
        this.model = model;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Model: " + model + ", Top Speed: " + speed;
    }

    @Override
    public int compareTo(Car c) {
        return (int) (this.speed - c.speed);
    }
}
