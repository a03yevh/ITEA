package Lessons.Lesson3;
import java.util.Scanner;
// Завдання 1. Даны целые числа K и N (N > 0). Вывести N раз число K.
public class L8_For {
    public static void main(String[] args) {
        int K;
        int N;

        System.out.print("K: ");
        Scanner scan = new Scanner(System.in);
        K = scan.nextInt();

        System.out.print("N: ");
        Scanner scan2 = new Scanner(System.in);
        N = scan2.nextInt();

        for (int i = 0; i < N; i++)
        {
            System.out.print(K + " ");
        }
    }
}
