package Lessons.Lesson2;
import java.util.Scanner;

public class L2_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число (n1): ");
        double n1 = scanner.nextDouble();

        System.out.print("Введіть число (n2): ");
        double n2 = scanner.nextDouble();

        System.out.print("Введіть число (n3): ");
        double n3 = scanner.nextDouble();

        double minimal = n2;

        if (n1 < minimal) { minimal = n1; }
        if (n3 < minimal) { minimal = n3; }

        System.out.println("Найменше число: " + minimal);
    }
}
