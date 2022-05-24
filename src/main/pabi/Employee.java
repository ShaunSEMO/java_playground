package main.pabi;

public class Employee {

    String name;
    String location;
    int salary;

    Employee(String name, String location, int salary) {
        this.name = name;
        this.location = location;
        this.salary = salary;

    }

    void SalaryIncrease() {
        this.salary = (salary * 10/100 + salary);
        System.out.println(salary + " increased by 10%");



    }
}
