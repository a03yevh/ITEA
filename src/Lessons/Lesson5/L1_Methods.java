package Lessons.Lesson5;
import java.util.Scanner;

//Завдання 1. Знайти середнє ариф серед двох-трьох цифр і серед п'яти цифр.
//Завдання 1.1. Є два методи - зробити третій метод, який знаходить макс. значення цих двох методів.

public class L1_Methods {

    public static double middle(double a, double b) {
        double c = 0;
        c = (a + b)/2;
        return c;
    }

    public static double middle(double a, double b, double f, double d, double e) {
        double c = 0;
        c = (a + b + f + d + e)/5;
        return c;
    }

    public static double maxMiddle() {
        double result = Math.max(middle(10, 5), middle(10, 3));
        return result;
    }

    public static void main(String[] args) {
        double num1, num2, num3, num4, num5;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Num1: ");
        num1 = scanner.nextDouble();

        System.out.print("Num2: ");
        num2 = scanner.nextDouble();

        System.out.print("Num3: ");
        num3 = scanner.nextDouble();

        System.out.print("Num4: ");
        num4 = scanner.nextDouble();

        System.out.print("Num5: ");
        num5 = scanner.nextDouble();

        System.out.println(middle(num1, num2));
        System.out.println(middle(num1, num2, num3, num4, num5));

        System.out.println(maxMiddle());
    }
}
