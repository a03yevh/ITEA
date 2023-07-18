package Homeworks.HW_Lesson9_sp.HW1;

public enum Animals {
    DOG(3),
    CAT(5),
    RABBIT(2);

    private int age;

    private Animals(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name() + " - " + age + " years old";
    }
}
