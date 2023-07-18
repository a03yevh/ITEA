package Lessons.Lesson2;
import java.util.Scanner;

public class L2_19 {
    //Case6
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть одиницю довжини: ");
        int d = scanner.nextInt();

        System.out.print("Введіть довжину в цих одиницях: ");
        double lng = scanner.nextInt();

        double coef = 0;

        switch (d) {
            case 1:
                coef = 0.1;
                System.out.println("Дециметри: " + (lng * coef));
                break;

            case 2:
                coef = 1000;
                System.out.println("Кілометри: " + (lng * coef));
                break;

            case 3:
                coef = 1;
                System.out.println("Метри: " + (lng * coef));
                break;

            case 4:
                coef = 0.001;
                System.out.println("Міліметри: " + (lng * coef));
                break;

            case 5:
                coef = 0.01;
                System.out.println("Сантиметри: " + (lng * coef));
                break;

            default:
                System.out.println("[!] Нервіний діапазон одиниці довжини. Діапазон: 1-5.");
                break;
        }
    }
}
