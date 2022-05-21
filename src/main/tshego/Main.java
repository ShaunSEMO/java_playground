package main.tshego;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Nissan", "GT-R R35", 2017);
        Truck myTruck = new Truck("MAN", "Viho 2x", 2012);

        myCar.printCarMake();
        myCar.startCarEngine();

        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");

        myTruck.printCarMake();
        myTruck.startCarEngine();

    }
}