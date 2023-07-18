package Lessons.Lesson7;

public class Pigeon extends Animals {

    public Pigeon(String color, String breed, int weight, int size, int age) {
        super(color, breed, weight, size, age);
    }

    public static void move() {
        System.out.println("I am flying now...");
    }

    public static void eat() {
        System.out.println("I am eating - corn...");
    }

    public static void main(String[] args) {
        Animals whitePigeon = new Animals("white", "drov", 1,10, 1);

        move();

        System.out.println(whitePigeon);

        eat();
    }
}
