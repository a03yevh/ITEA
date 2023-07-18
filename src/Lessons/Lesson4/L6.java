package Lessons.Lesson4;

/*Даны целые числа N (> 2), A и B. Сформировать и вывести цело численный массив размера N, первый элемент которого равен A, второй равен B, а каждый последующий
элемент равен сумме всех предыдущих.*/

import java.util.Scanner;

public class L6 {
    public static void main(String[] args) {
        int N, A, B;
        int arr[];
        Scanner scanner = new Scanner(System.in);

        System.out.print("N: ");
        N = scanner.nextInt();

        if (N > 2) {
            arr = new int[N];
            System.out.print("First element arr: ");
            arr[0] = scanner.nextInt();

            System.out.print("Second element arr: ");
            arr[1] = scanner.nextInt();

            for (int i = 2; i < N; i++) {
                int sum = 0;
                for (int j = 0; j < i; j++) {
                    sum += Math.abs(arr[j]);
                }
                arr[i] = sum;
            }

            // List arr:
            for (int i = 0; i < N; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            System.out.println("Error, N <= 2!");
        }
    }
}