package Homeworks.HW_Lesson4;
import java.util.Scanner;

/*Використовуючи IntelliJ IDEA, створіть клас NumbersCheck. Напишіть метод, який визначатиме:
1)      чи є введене число позитивним, чи негативним;
2)      чи є воно простим (використовуйте техніку перебору значень).
Просте число – це натуральне число, яке ділиться на 1 й саме на себе. Щоби визначити просте число чи ні, варто знайти всі його цілі дільники.
Якщо дільників більше 2-х, то воно не просте;
3)      чи ділиться воно на 2, 5, 3, 6, 9 без залишку.*/

public class HW8_NumbersCheck {
    public static void NumCheck(int n) {
        //task 1
        if (n < 0) {
            System.out.println("Negative num.");
        } else {
            System.out.println("Positive num.");
        }

        //task 2
        int counter = 0;
        for (int i = 2; i < n-1; i++) {
            if (n % i == 0) {
                counter++;
            }
        }

        if (counter == 0) {
            System.out.println("Chyslo proste.");
        } else {
            System.out.println("Chyslo ne proste.");
        }

        //task 3
        if (n % 2 == 0) {
            System.out.println("The number is divisible by 2.");
        }
        if (n % 5 == 0) {
            System.out.println("The number is divisible by 5.");
        }
        if (n % 3 == 0) {
            System.out.println("The number is divisible by 3.");
        }
        if (n % 6 == 0) {
            System.out.println("The number is divisible by 6.");
        }
        if (n % 9 == 0) {
            System.out.println("The number is divisible by 9.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter num for analyze: ");
        int check = scanner.nextInt();

        NumCheck(check);
    }
}
