package Lessons.Lesson2;
import java.util.Scanner;

public class L2_6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ціле число #1: ");
        double number1 = scanner.nextDouble();

        System.out.print("Введіть ціле число #2: ");
        double number2 = scanner.nextDouble();

        if (number1 > number2) {
            System.out.println("Відповідь: число 1 > число 2");
        }

        else if (number1 < number2) {
            System.out.println("Відповідь: число 1 < число 2");
        }
    }
}