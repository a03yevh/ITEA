package Homeworks.HW_Lesson7_sp.HW0;

public abstract class Car {
    private String model;
    private double power;
    private int speed;
    private double price;
    private final int yearOfManufacture = 1967;

    public Car(String model, double power, int speed, double price) {
        this.model = model;
        this.power = power;
        this.speed = speed;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public double getPower() {
        return power;
    }

    public int getSpeed() {
        return speed;
    }

    public double getPrice() {
        return price;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }
}