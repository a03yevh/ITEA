package Lessons.Lesson5;

//Завдання 2. Сделать калькулятор. Есть основные кнопки  (+, -, *, /, sqrt(), ^()).

public class L2 {
    public static void sum(int a, int b) {
        System.out.println(a + b);
    }

    public static void sum(int a, double b) {
        System.out.println(a + b);
    }

    public static void sum(double a, int b) {
        System.out.println(a + b);
    }

    public static void sum(double a, double b) {
        System.out.println(a + b);
    }

    public static void minus(int a, int b) {
        System.out.println(a - b);
    }

    public static void minus(int a, double b) {
        System.out.println(a - b);
    }

    public static void minus(double a, int b) {
        System.out.println(a - b);
    }

    public static void minus(double a, double b) {
        System.out.println(a - b);
    }

    public static void div(int a, int b) {
        System.out.println(a / b);
    }

    public static void div(int a, double b) {
        System.out.println(a / b);
    }

    public static void div(double a, int b) {
        System.out.println(a / b);
    }

    public static void div(double a, double b) {
        System.out.println(a / b);
    }

    public static void mult(int a, int b) {
        System.out.println(a * b);
    }

    public static void mult(int a, double b) {
        System.out.println(a * b);
    }

    public static void mult(double a, int b) {
        System.out.println(a * b);
    }

    public static void mult(double a, double b) {
        System.out.println(a * b);
    }

    public static void sqrt(int a) {
        System.out.println(Math.sqrt(a));
    }

    public static void sqrt(double a) {
        System.out.println(Math.sqrt(a));
    }

    public static void pow(int a, int b) {
        System.out.println(Math.pow(a,b));
    }

    public static void pow(double a, int b) {
        System.out.println(Math.pow(a,b));
    }


    public static void main(String[] args) {
        sum(2,3);
        minus(5,3);
        div(25,5);
        mult(2,4);
        sqrt(25);
        pow(5,3);
    }
}
