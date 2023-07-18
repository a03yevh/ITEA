package Lessons.Lesson2;
import java.util.Scanner;

public class L2_18 {
    //Case5
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть ціле число: ");
        int N = scanner.nextInt();

        System.out.print("Введіть A: ");
        double A = scanner.nextInt();

        System.out.print("Введіть B: ");
        double B = scanner.nextInt();


        switch (N) {
            case 1:
                System.out.println("+ => " + (A + B));
                break;

            case 2:
                System.out.println("- => " + (A - B));
                break;

            case 3:
                System.out.println("* => " + (A * B));
                break;

            case 4:
                System.out.println("/ => " + (A / B));
                break;

            default:
                System.out.println("[!] Нервіний діапазон. Діапазон: 1-4.");
                break;
        }
    }
}
