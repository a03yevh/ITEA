package Homeworks.HW_Lesson3;
import java.util.Scanner;

/*Дано два цілих числа A і B (A < B). Знайдіть суму всіх цілих чисел від A до B включно.*/

public class HW5 {
    public static void main(String[] args) {
        int A, B;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("A: ");
        A = scanner.nextInt();

        System.out.print("B: ");
        B = scanner.nextInt();

        if (A < B) {
            for (int i=A; i<=B; i++) {
               sum = sum + i;
            }
        System.out.println("Sum: " + sum);
        } else {
            System.out.println("Error! A must be < B.");
        }
    }
}
