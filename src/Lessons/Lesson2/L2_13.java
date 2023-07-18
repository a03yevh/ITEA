package Lessons.Lesson2;
import java.util.Scanner;

public class L2_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число (n1): ");
        double n1 = scanner.nextDouble();

        System.out.print("Введіть число (n2): ");
        double n2 = scanner.nextDouble();

        System.out.print("Введіть число (n3): ");
        double n3 = scanner.nextDouble();

        double middle_number = 0;

        if (n1 > n2) {
            if (n2 > n3) {
                middle_number = n2;
            } else if (n1 > n3) {
                middle_number = n3;
            } else {
                middle_number = n1;
            }
        } else {
            if (n1 > n3) {
                middle_number = n1;
            } else if (n2 > n3) {
                middle_number = n3;
            } else {
                middle_number = n2;
            }
        }
    }
}
