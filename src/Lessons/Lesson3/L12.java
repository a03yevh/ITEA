package Lessons.Lesson3;
import java.util.Scanner;
// Завдання 6. Дано вещественное число — цена 1 кг конфет. Вывести стоимость 1.2, 1.4, . . . , 2 кг конфет.
public class L12 {
    public static void main(String[] args) {
        double A, money;

        System.out.print("Цена 1 кг конфет: ");
        Scanner scan = new Scanner(System.in);
        A = scan.nextDouble();

        for (double i = 1.2; i <= 2.0; i += 0.2) {
            money = i * A;
            System.out.println("Для " + i + " кг конфет: " + money);
        }
    }
}
