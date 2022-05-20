package main.tshego;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Nissan", "GT-R R35", 2017);
        StringBuilder newString = new StringBuilder();
        newString.append("Hello");
        newString.insert(1, "a");
        System.out.println(newString.charAt(1));
        myCar.printCarMake();
    }
}