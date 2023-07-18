package Lessons.Lesson3;
// Задание 4. Даны два целых числа: A, B. Проверить истинность высказывания: «Справедливы неравенства A > 2 и B ≤ 3».
public class L3 {
    public static void main(String[] args) {
        int a = 3;
        int b = 1;

        boolean dd = (a > 2 & b <= 3);

        System.out.println("Справедливы неравенства A > 2 и B ≤ 3: " + dd);
    }
}
