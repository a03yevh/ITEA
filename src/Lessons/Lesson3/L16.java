package Lessons.Lesson3;
import java.util.Scanner;
// Завдання 9. Даны два целых числа A и B (A < B). Найти сумму квадратов всех целых чисел от A до B включительно.
public class L16 {
    public static void main(String[] args) {
        int A, B;

        int sum = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("A: ");
        scan = new Scanner(System.in);
        A = scan.nextInt();

        System.out.print("B: ");
        scan = new Scanner(System.in);
        B = scan.nextInt();

        if (A < B) {
            for (int i = A; i <= B; i++) {
                sum = sum + (i * i);
            }
            System.out.println("\nСума квадратів чисел: " + sum);
        } else {
            System.out.println("Error! A must be < B");
        }
    }
}
