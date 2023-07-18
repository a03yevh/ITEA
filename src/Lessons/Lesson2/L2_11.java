package Lessons.Lesson2;
import java.util.Scanner;

public class L2_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ціле число #1: ");
        int A = scanner.nextInt();

        System.out.print("Введіть ціле число #2: ");
        int B = scanner.nextInt();

        if (A != B) {
            if (A > B) {
                B = A;
            } else {
                A = B;
            }
        } else {
            A = 0;
            B = 0;
        }

        System.out.println("A = " + A);
        System.out.println("B = " + B);
    }
}
