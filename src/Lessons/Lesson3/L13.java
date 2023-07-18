package Lessons.Lesson3;
import java.util.Scanner;
// Завдання 5. Дано вещественное число — цена 1 кг конфет. Вывести стоимость 0.1, 0.2, . . . , 1 кг конфет.
public class L13 {
    public static void main(String[] args) {
        double A, money;

        System.out.print("Цена 1 кг конфет: ");
        Scanner scan = new Scanner(System.in);
        A = scan.nextDouble();

        for (double i = 0.1; i <= 1.0; i += 0.1) {
            money = i * A;
            System.out.println("Для " + i + " кг конфет: " + money);
        }
    }
}
