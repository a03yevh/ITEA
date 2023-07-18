package Lessons.Lesson2;
import java.util.Scanner;

public class L2_4 {
    public static void main(String[] args) {

        int counter = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ціле число #0: ");
        int number0 = scanner.nextInt();

        System.out.print("Введіть ціле число #1: ");
        int number1 = scanner.nextInt();

        System.out.print("Введіть ціле число #2: ");
        int number2 = scanner.nextInt();

        if (number0 >= 0) {
            counter++;
        }

        if (number1 >= 0) {
            counter++;
        }

        if (number2 >= 0) {
            counter++;
        }

        System.out.println("Кількість додатніх : " + counter);
    }
}