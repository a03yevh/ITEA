package Lessons.Lesson7;

public class Animals {
    private String color;
    private String breed;
    private int weight;
    private int size;
    private int age;

    public static void move() {
        System.out.println("I am running...");
    }

    public static void eat() {
        System.out.println("I am eating...");
    }

    public Animals(String color, String breed, int weight, int size, int age) {
        this.color = color;
        this.breed = breed;
        this.weight = weight;
        this.size = size;
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public String getBreed() {
        return breed;
    }

    public int getWeight() {
        return weight;
    }

    public int getSize() {
        return size;
    }

    public int getAge() {
        return age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "color='" + color + '\'' +
                ", breed='" + breed + '\'' +
                ", weight=" + weight +
                ", size=" + size +
                ", age=" + age +
                '}';
    }
}
