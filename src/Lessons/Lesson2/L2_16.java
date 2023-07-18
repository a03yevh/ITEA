package Lessons.Lesson2;
import java.util.Scanner;

public class L2_16 {
    //Case3
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть номер місяця: ");
        int k = scanner.nextInt();

        switch (k) {
            case 1:
                System.out.println("Місяць: січень");
                break;

            case 2:
                System.out.println("Місяць: лютий");
                break;

            case 3:
                System.out.println("Місяць: березень");
                break;

            case 4:
                System.out.println("Місяць: квітень");

                break;

            case 5:
                System.out.println("Місяць: травень");
                break;

            case 6:
                System.out.println("Місяць: червень");

                break;

            case 7:
                System.out.println("Місяць: липень");
                break;

            case 8:
                System.out.println("Місяць: серпень");

                break;

            case 9:
                System.out.println("Місяць: вересень");
                break;

            case 10:
                System.out.println("Місяць: жовтень");

                break;

            case 11:
                System.out.println("Місяць: листопад");
                break;

            case 12:
                System.out.println("Місяць: грудень");
                break;

            default:
                System.out.println("[!] Нервіне номер місяця. Діапазон: 1-12.");
                break;
        }
    }
}
