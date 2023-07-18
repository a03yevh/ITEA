package Homeworks.HW_Lesson3;

/*Використовуючи IntelliJ IDEA, створіть клас SumMin. Дано два числа A та B (A<B). Виведіть суму всіх чисел, які розташовані між цими числами на екран.
Дано два числа A та B (A<B). Виведіть усі непарні значення, які розташовані між цими числами.*/

import java.util.Scanner;

public class HW2_SumMin {
    public static void main(String[] args) {
        int A, B;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter A: ");
        A = scanner.nextInt();

        System.out.print("Enter B: ");
        B = scanner.nextInt();

        if (A < B) {
            System.out.print("Numbers in between (" + A + ";" + B +"): \n");
            for (int i=A+1; i<B; i++) {
                System.out.print(i + " ");
                sum += i;
            }
            System.out.print("\nSum (" + A + ";" + B +"): " + sum);
            System.out.print("\nOdd numbers: \n");
            for (int i=A+1; i<B; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.print("\nError: A must be < B!");
        }
    }
}
