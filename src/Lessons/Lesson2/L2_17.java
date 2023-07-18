package Lessons.Lesson2;
import java.util.Scanner;

public class L2_17 {
    //Case4
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть номер місяця: ");
        int k = scanner.nextInt();
        int days;

        switch (k) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;

            case 2:
                days = 28;
                break;

            default:
                System.out.println("[!] Нервіний номер місяця. Діапазон: 1-12.");
                break;
        }
    }
}
