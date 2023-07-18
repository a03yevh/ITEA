package Lessons.Lesson3;
import java.util.Scanner;
// Завдання 8. Даны два целых числа A и B (A < B). Найти произведение всех целых чисел от A до B включительно.
public class L15 {
    public static void main(String[] args) {
        int A, B;

        int d = 1;

        Scanner scan = new Scanner(System.in);

        System.out.print("A: ");
        scan = new Scanner(System.in);
        A = scan.nextInt();

        System.out.print("B: ");
        scan = new Scanner(System.in);
        B = scan.nextInt();

        if (A < B) {
            for (int i = A; i <= B; i++) {
                d = d * i;
            }

            System.out.println("\nПроизведение: " + d);
        } else {
            System.out.println("Error! A must be < B");
        }
    }
}
