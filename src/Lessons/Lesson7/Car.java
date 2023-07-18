package Lessons.Lesson7;

public class Car {
    private String brand;
    private String model;
    private String color;

    private String date;
    private String VIN;
    private int countWheels;
    private String typeCarBody;
    private int price;
    private int doors;
    private String fuelType;

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public void setCountWheels(int countWheels) {
        this.countWheels = countWheels;
    }

    public void setTypeCarBody(String typeCarBody) {
        this.typeCarBody = typeCarBody;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getDate() {
        return date;
    }

    public String getVIN() {
        return VIN;
    }

    public int getCountWheels() {
        return countWheels;
    }

    public String getTypeCarBody() {
        return typeCarBody;
    }

    public int getPrice() {
        return price;
    }

    public int getDoors() {
        return doors;
    }
}
