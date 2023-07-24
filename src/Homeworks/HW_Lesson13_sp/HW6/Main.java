package Homeworks.HW_Lesson13_sp.HW6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* Завдання 7: Створити список та заповнити рандомними числами 10 осередків, потрібно вивести суму квадратів усіх елементів списку.
Ми використовуємо метод map() для зведення квадрат кожного елемента, а потім застосовуємо метод reduce() для обʼєднання всіх елементів в одне число.*/

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            nums.add(random.nextInt(15) + 1);
        }

        int totalSum = nums.stream()
                .map(numbers -> numbers * numbers)
                .reduce(0, (a, b) -> a + b);

        System.out.println("Список чисел: " + nums);
        System.out.println("Сума квадратів чисел: " + totalSum);
    }
}
