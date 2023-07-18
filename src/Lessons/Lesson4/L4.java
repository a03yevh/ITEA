package Lessons.Lesson4;
import java.util.Scanner;
import java.lang.Math;

/*Дано целое число N (> 1), а также первый член A и знаменатель D геометрической прогрессии.
Сформировать и вывести массив размера N, содержащий N первых членов данной прогрессии: A, A·D, A·D2, A·D3, . . . .*/

public class L4 {
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
            for (int i = 0; i < N; i++) {
                arr[i] = A * (int)Math.pow(D, i);
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
