package Lessons.Lesson2;
import java.util.Scanner;

public class L2_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число #1: ");
        double A = scanner.nextDouble();

        System.out.print("Введіть число #2: ");
        double B = scanner.nextDouble();

        double temp = 0;

        if (A > B) {
            temp = A;
            A = B;
            B = temp;
        }

        System.out.println("A (найменше) = " + A);
        System.out.println("B (найбільше) = " + B);
    }
}
