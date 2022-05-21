package main.tshego;

public class Truck extends Vehicle {
    private String brand;
    private String model;
    private Integer year;
    public Truck(String brand, String model, Integer year){
        super(brand, model, year);
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void printCarMake() {
        System.out.println("Brand: "+this.brand+"\n"+"Model: "+this.model+"\n"+"Year: "+this.year+"\n!!!!!!!!!!");
    }
}
