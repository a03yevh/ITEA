package Homeworks.HW_Lesson5;

public class HW1_Person {
    private String fullName;
    private int age;

    HW1_Person() {
        this.fullName = "Yulia";
        this.age = 22;
    }

    HW1_Person(String x, int y) {
        this.fullName = x;
        this.age = y;
    }
    public void move() {
        System.out.println(fullName + " is moving... ");
    }

    public void talk() {
        System.out.println(fullName + " is talking... ");
    }

    public static void main(String[] args) {
        HW1_Person obj1 = new HW1_Person();
        HW1_Person obj2 = new HW1_Person("Tarasov Oleg Nikolaevich", 33);
        obj1.move();
        obj2.talk();

        obj2.move();
        obj1.talk();
    }
}
