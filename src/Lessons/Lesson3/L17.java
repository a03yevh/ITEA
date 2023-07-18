package Lessons.Lesson3;
import java.util.Scanner;
// Завдання 10. Дано целое число N (> 0). Найти сумму 1 + 1/2 + 1/3 + . . . + 1/N (вещественное число).
public class L17 {
    public static void main(String[] args) {
        double N;

        double sum = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("N: ");
        scan = new Scanner(System.in);
        N = scan.nextDouble();

        if (N > 0) {
            for (double i = 1; i <= N; i++) {
                sum = sum + (1/i);
            }
            System.out.println("Сума: " + sum);
        } else {
            System.out.println("Error! N must be > 0");
        }
    }
}
