package Lessons.Lesson2;
import java.util.Scanner;

public class L2_15 {
    //Case2
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int k = scanner.nextInt();

        switch (k) {
            case 1:
                System.out.println("Оцінка: погано");
                break;

            case 2:
                System.out.println("Оцінка: незадовільно");
                break;

            case 3:
                System.out.println("Оцінка: задовільно");
                break;

            case 4:
                System.out.println("Оцінка: добре");

                break;

            case 5:
                System.out.println("Оцінка: чудово");
                break;

            default:
                System.out.println("[!] Нервіне число. Діапазон: 1-5.");
                break;
        }
    }
}
