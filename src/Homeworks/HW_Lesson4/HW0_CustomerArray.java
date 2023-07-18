package Homeworks.HW_Lesson4;
import java.util.Scanner;
import java.lang.Math;

/*Використовуючи IntelliJ IDEA, створіть клас CustomerArray. Створити масив розміру N-елементів, заповнити його довільними цілими значеннями (розмір масиву задає
користувач). Вивести на екран: найбільше значення масиву, найменше значення масиву, загальну суму всіх елементів, середнє арифметичне всіх елементів,
вивести всі непарні значення.*/

public class HW0_CustomerArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int N = scanner.nextInt();

        int array[] = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = (int)(Math.random() * 1001);
        }

        //Visual arr
        for (int i = 0; i < N; i++) {
            System.out.print(array[i] + " ");
        }

        //Find max
        int max = array[0];
        for (int i = 1; i < N; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("\nMax: " + max);

        //Find min
        int min = array[0];
        for (int i = 1; i < N; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Min: " + min);

        //Find sum
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum = sum + array[i];
        }
        System.out.println("Sum: " + sum);

        //Average
        System.out.println("Average: " + (sum / N));

        //Find odd digits
        System.out.println("Odd digits:");
        for (int i = 0; i < N; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
