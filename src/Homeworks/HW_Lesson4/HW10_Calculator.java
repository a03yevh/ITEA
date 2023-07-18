package Homeworks.HW_Lesson4;
import java.util.Scanner;

/*Використовуючи IntelliJ IDEA, створіть клас Calculator. Створіть метод з ім'ям calculate, який приймає як параметри три цілих аргументи та
виводить на екран середнє арифметичне значень аргументів.*/

import java.util.Scanner;

public class HW10_Calculator {
    public static void calculate(int a, int b, int c) {
        System.out.println("Result: " + ((a + b + c) / 3.0));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int N1 = scanner.nextInt();

        System.out.print("Enter num2: ");
        int N2 = scanner.nextInt();

        System.out.print("Enter num3: ");
        int N3 = scanner.nextInt();

        calculate(N1, N2, N3);
    }
}