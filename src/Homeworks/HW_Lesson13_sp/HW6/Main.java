package Homeworks.HW_Lesson13_sp.HW6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
        System.out.println("Сума квадратів: " + totalSum);
    }
}
