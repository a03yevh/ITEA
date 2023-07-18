package Lessons.Lesson4;
import java.util.Scanner;

/*Дано целое число N (> 0). Сформировать и вывести целочисленный массив размера N, содержащий степени двойки от первой до N-й: 2, 4, 8, 16, . . . .*/

public class L2 {
    public static void main(String[] args) {
        int N;

        Scanner scanner = new Scanner(System.in);

        System.out.print("N: ");
        N = scanner.nextInt();

        int first = 2;
        int[] arr = new int[N];

        if (N > 0) {
            for (int i = 0; i < N; i++) {
                arr[i] = first;
                first += first;
            }
        } else {
            System.out.println("Error, N <= 0.");
        }

        System.out.println("\narr[] -> List: ");
        for (int i = 0; i < N; i++) {
            System.out.println("arr[" + i + "] = " + arr [i]);
        }
    }
}