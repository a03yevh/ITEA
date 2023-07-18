package Homeworks.HW_Lesson9_sp.HW3;

public class Price implements Comparable<Price> {
    private String productName;
    private String storeName;
    private double price;

    public Price(String productName, String storeName, double price) {
        this.productName = productName;
        this.storeName = storeName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public String getStoreName() {
        return storeName;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Price other) {
        return storeName.compareTo(other.getStoreName());
    }
}