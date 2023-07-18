package Lessons.Lesson7;

public class Truck extends Car {
    public static void main(String[] args) {
        Truck truck = new Truck();
        truck.setColor("black");
        truck.setBrand("Volvo");
        truck.setDate("2020");

        System.out.println(truck);
    }
}
