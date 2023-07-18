package Lessons.Lesson2;
import java.util.Scanner;

public class Discriminant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Квадратне рівнняння, виду: ax^2+bx+c=0");

        System.out.print("\nВведіть a: ");
        double a = scanner.nextDouble();

        System.out.print("Введіть b: ");
        double b = scanner.nextDouble();

        System.out.print("Введіть c: ");
        double c = scanner.nextDouble();

        double D = (Math.pow(b, 2) - 4 * a * c);

        double x1, x2;

        if (D == 0) {
            x1 = ((-b)/(2*a));
            System.out.println("----------------------");
            System.out.print("x: " + x1);
            System.out.print("\n----------------------");
        }

        else if (D > 0) {
            x1 = ((-b + Math.sqrt(D)) / (2*a));
            x2 = ((-b - Math.sqrt(D)) / (2*a));
            System.out.println("----------------------");
            System.out.print("x1: " + x1);
            System.out.print("\nx2: " + x2);
            System.out.print("\n----------------------");
        }

        else if (D < 0) {
            System.out.println("----------------------");
            System.out.print("[!] Дійсних коренів немає.");
            System.out.print("\n----------------------");
        }

        else {
            System.out.println("Some error. Check code.");
        }
    }
}
