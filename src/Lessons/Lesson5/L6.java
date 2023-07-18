package Lessons.Lesson5;

//Завдання 6. Рекурсивно. Зробити програму, яка запитує у користувача ціле число, конвертує його в двійкову та вісімкову системи числення.

import java.util.Scanner;

public class L6 {
    public static void func1(int number) {
        int test;
        test = number % 8;
        if (number >= 8) {
            func1(number / 8);
        }
        System.out.println(test);
    }

    public static void func2(int number) {
        int test;
        test = number % 2;
        if (number >= 2) {
            func2(number / 2);
        }
        System.out.println(test);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        func2(number);
        System.out.println(" ");
        func1(number);
    }
}
