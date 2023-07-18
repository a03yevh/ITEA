package Homeworks.HW_Lesson11_sp.HW9;

class Animal {
    private int privateField = 10;
    static String staticField = "Hello";
    private static final int age = 100500;

    public void printFields() {
        System.out.println("Private Field: " + privateField);
        System.out.println("Static Field: " + staticField);
        System.out.println("Final Static Field: " + age);
    }
}