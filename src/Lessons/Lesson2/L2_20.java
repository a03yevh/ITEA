package Lessons.Lesson2;
import java.util.Scanner;

public class L2_20 {
    //Case7
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть одиницю маси: ");
        int d = scanner.nextInt();

        System.out.print("Введіть масу тіла в цих одиницях: ");
        double lng = scanner.nextInt();

        double coef = 0;

        switch (d) {
            case 1:
                coef = 1000;
                System.out.println("Кілограм: " + (lng * coef));
                break;

            case 2:
                coef = 0.000001;
                System.out.println("Міліграм: " + (lng * coef));
                break;

            case 3:
                coef = 0.001;
                System.out.println("Грам: " + (lng * coef));
                break;

            case 4:
                coef = 1000;
                System.out.println("Тонна: " + (lng * coef));
                break;

            case 5:
                coef = 100;
                System.out.println("Центнер: " + (lng * coef));
                break;

            default:
                System.out.println("[!] Нервіний діапазон одиниці маси. Діапазон: 1-5.");
                break;
        }
    }
}
