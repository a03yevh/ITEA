package Lessons.Lesson3;
import java.util.Scanner;
// Завдання 2. Даны два целых числа A и B (A < B). Вывести в порядке возрастания все целые числа, расположенные между A и B (включая сами числа A и B), а также количество N этих чисел.
public class L9 {
    public static void main(String[] args) {
        int A, B;

        System.out.print("A: ");
        Scanner scan = new Scanner(System.in);
        A = scan.nextInt();

        System.out.print("B: ");
        Scanner scan2 = new Scanner(System.in);
        B = scan2.nextInt();

        int counter = 0;

        if (A < B) {
            for (int i = A; i <= B; i++) {
                System.out.print(i + " ");
                counter++;
            }
            System.out.print("\nN: " + counter);
        } else {
            System.out.print("Error! A must be < B");
        }
    }
}
