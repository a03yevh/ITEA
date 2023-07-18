package Lessons.Lesson2;
import java.util.Scanner;

public class L2_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть перше число: ");
        int number1 = scanner.nextInt();

        System.out.print("Введіть друге число: ");
        int number2 = scanner.nextInt();

        if (number1 < number2) {
            System.out.println("Порядковий номер меншого числа -> 1");
        } else {
            System.out.println("Порядковий номер меншого числа -> 2");
        }
    }
}