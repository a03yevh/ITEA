package Lessons.Lesson2;
import java.util.Scanner;

public class L2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть ціле число: ");
        int number = scanner.nextInt();

        if (number > 0) {
            number++;
            System.out.println("Відповідь -> " + number);

        }

        else if (number == 0) {
            number = 10;
            System.out.println("Відповідь -> " + number);
        }

        else {
            number -= 2;
            System.out.println("Відповідь -> " + number);
        }
    }

}