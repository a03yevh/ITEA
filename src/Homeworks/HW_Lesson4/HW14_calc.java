package Homeworks.HW_Lesson4;

/*Використовуючи IntelliJ IDEA, створіть клас Calculator. Створіть метод з ім'ям calculate, який приймає як параметри три цілочислові значення та
повертає значення кожного аргументу, поділеного на 5.*/

public class HW14_calc {
    public static String calculate(int x, int y, int z) {
        return "A: " + (x / 5) + "; B: " + (y / 5) + "; C: " + (z / 5);
    }

    public static void main(String[] args) {
        int a = 15;
        int b = 25;
        int c = 35;
        String res = calculate(a, b, c);
        System.out.println(res);
    }
}
