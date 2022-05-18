package main.tshego;

public class Car {
    private String brand;
    private String model;
    private Integer year;

    public Car(String brand, String model, Integer year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void printCarMake() {
        System.out.println("Brand: "+this.brand+"\n"+"Model: "+this.model+"\n"+"Year: "+this.year);
    }
}
