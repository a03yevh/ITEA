package Lessons.Lesson2;
import java.util.Scanner;

public class L2_1 {
       public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введіть ціле число: ");
            int number = scanner.nextInt();

            if (number >= 0) {
                number++;
                System.out.println("Число додатнє -> " + number);

            }
            else {
                System.out.println("Число від'ємне -> " + number);
        }
    }

}