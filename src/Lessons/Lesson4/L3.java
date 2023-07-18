package Lessons.Lesson4;

/*Дано целое число N (> 1), а также первый член A и разность D ариф метической прогрессии. Сформировать и вывести массив размера N, со держащий N
первых членов данной прогрессии: A, A + D, A + 2·D, A + 3·D, . . . .*/

import java.util.Scanner;

public class L3 {
    public static void main(String[] args) {
        int N, A, D;

        Scanner scanner = new Scanner(System.in);

        System.out.print("N: ");
        N = scanner.nextInt();

        int arr[] = new int[N];

        System.out.print("A: ");
        A = scanner.nextInt();

        System.out.print("D: ");
        D = scanner.nextInt();

        if (N > 1) {
            arr[0] = A;
            for (int i = 1; i < N; i++) {
                arr[i] = A + (i * D);
            }

            //List arr:
            for (int i = 0; i < N; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            System.out.println("Error, N <= 1!");
        }
    }
}
