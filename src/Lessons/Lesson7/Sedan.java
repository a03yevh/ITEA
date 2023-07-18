package Lessons.Lesson7;

public class Sedan extends Car {
    public static void main(String[] args) {
        Sedan sedan = new Sedan();
        sedan.setColor("white");
        sedan.setDate("2017");
        sedan.setBrand("BMW");

        System.out.println(sedan);
    }
}
