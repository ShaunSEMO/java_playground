package main.tshego;

public class Car extends Vehicle {
    public Car(String brand, String model, Integer year) {
        super(brand, model, year);
    }

    public void startCarEngine() {
        System.out.println("Jing jiingg");
    }
}
