package Homeworks.HW_Lesson3;
import java.util.Scanner;

/*Дано ціле число N (> 0). Використовуючи один цикл, знайдіть суму 1 + 1/(1!) + 1/(2!) + 1/(3!) +. . . + 1/(N!)*/

public class HW6 {
    public static void main(String[] args) {
        int N;
        int i = 1;
        double f = 1;
        double sum = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.print("N: ");
        N = scanner.nextInt();

        if (N > 0) {
            do {
                f = f * i;
                sum = sum + (1/f);
                i++;
            } while (i <= N);
            System.out.println("Sum: " + sum);
        } else {
            System.out.println("Error! N must be > 0.");
        }
    }
}
