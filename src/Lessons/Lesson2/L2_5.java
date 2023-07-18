package Lessons.Lesson2;
import java.util.Scanner;

public class L2_5 {
    public static void main(String[] args) {

        int counter_plus = 0;
        int counter_minus = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ціле число #0: ");
        int number0 = scanner.nextInt();

        System.out.print("Введіть ціле число #2: ");
        int number1 = scanner.nextInt();

        System.out.print("Введіть ціле число #3: ");
        int number2 = scanner.nextInt();

        if (number0 >= 0) {
            counter_plus++;
        }
        else {
            counter_minus++;
        }

        if (number1 >= 0) {
            counter_plus++;
        }
        else {
            counter_minus++;
        }

        if (number2 >= 0) {
            counter_plus++;
        }
        else {
            counter_minus++;
        }

        System.out.println("Кількість додатніх : " + counter_plus);
        System.out.println("Кількість від'ємних : " + counter_minus);
    }
}