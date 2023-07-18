package Homeworks.HW_Lesson11_sp.HW1;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/*Мінімальне з N чисел (використовувати LinkedList):
        1. Введіть із клавіатури число N.
        2. Вважати N цілих чисел і заповнити ними список - метод getIntegerList.
        3. Знайти мінімальне число серед елементів списку – метод getMinimum.*/

public class MinimumNumber {
    public static void main(String[] args) {
        int N = getNumberFromUser("Enter the number N from the keyboard: ");

        List<Integer> numbers = getIntegerList(N);
        int minimum = getMinimum(numbers);

        System.out.println("Minimum number: " + minimum);
    }

    public static int getNumberFromUser(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public static List<Integer> getIntegerList(int N) {
        List<Integer> numbers = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter " + N + " integers:");
        for (int i = 0; i < N; i++) {
            int number = scanner.nextInt();
            numbers.add(number);
        }

        return numbers;
    }

    public static int getMinimum(List<Integer> numbers) {
        int minimum = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number < minimum) {
                minimum = number;
            }
        }
        return minimum;
    }
}
