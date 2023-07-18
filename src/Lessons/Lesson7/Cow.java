package Lessons.Lesson7;

public class Cow extends Animals {
    public Cow(String color, String breed, int weight, int size, int age) {
        super(color, breed, weight, size, age);
    }

    public static void move() {
        System.out.println("I am running now...");
    }

    public static void eat() {
        System.out.println("I am eating - grass...");
    }

    public static void main(String[] args) {
        Animals Cow = new Animals("black", "dro", 100,20, 1);
        System.out.println(Cow);

        move();
        eat();
    }
}
