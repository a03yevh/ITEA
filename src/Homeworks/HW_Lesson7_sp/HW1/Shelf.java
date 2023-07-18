package Homeworks.HW_Lesson7_sp.HW1;

public class Shelf implements Product {
    private String name;
    private double price;

    public Shelf(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}