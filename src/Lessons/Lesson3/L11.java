package Lessons.Lesson3;
import java.util.Scanner;
// Завдання 4. Дано вещественное число — цена 1 кг конфет. Вывести стоимость 1, 2, . . . , 10 кг конфет.
public class L11 {
    public static void main(String[] args) {
        float A, money;

        System.out.print("Цена 1 кг конфет: ");
        Scanner scan = new Scanner(System.in);
        A = scan.nextFloat();

        for (int i = 1; i <= 10; i++) {
            money = i * A;
            System.out.println("Для " + i + " кг конфет: " + money);
        }
    }
}
