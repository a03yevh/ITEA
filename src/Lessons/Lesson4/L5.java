package Lessons.Lesson4;

import java.util.Scanner;

/*Дано целое число N (> 2). Сформировать и вывести целочисленный массив размера N, содержащий N первых элементов последовательности
чисел Фибоначчи FK: F1 = 1, F2 = 1, FK = FK−2 + FK−1, K = 3, 4, . . . .*/

public class L5 {
    public static void main(String[] args) {
        int N;

        Scanner scanner = new Scanner(System.in);

        System.out.print("N: ");
        N = scanner.nextInt();

        int[] arr = new int[N];
        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < N; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        // List arr:
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
