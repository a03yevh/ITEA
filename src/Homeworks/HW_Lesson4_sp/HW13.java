package Homeworks.HW_Lesson4_sp;

/*Створіть три перевантажені методи для пошуку середнього арифметичного числа з 3, 4, 5 змінних, створіть метод для пошуку мінімального, максимального та
середнього значень серед цих трьох методів.*/

public class HW13 {
    public static void main(String[] args) {
        double avg1 = average(10, 20, 30);
        double avg2 = average(10, 20, 30, 40);
        double avg3 = average(10, 20, 30, 40, 50);

        double min = minimum(avg1, avg2, avg3);
        double max = maximum(avg1, avg2, avg3);
        double avg = average(avg1, avg2, avg3);

        System.out.println("Мінімальне значення: " + min);
        System.out.println("Максимальне значення: " + max);
        System.out.println("Середнє значення: " + avg);
    }

    public static double average(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public static double average(double a, double b, double c, double d) {
        return (a + b + c + d) / 4;
    }

    public static double average(double a, double b, double c, double d, double e) {
        return (a + b + c + d + e) / 5;
    }

    public static double minimum(double a, double b, double c) {
        return Math.min(Math.min(a, b), c);
    }

    public static double maximum(double a, double b, double c) {
        return Math.max(Math.max(a, b), c);
    }
}
