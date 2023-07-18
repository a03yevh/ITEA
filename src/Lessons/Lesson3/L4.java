package Lessons.Lesson3;
// Задание 5. Даны два целых числа: A, B. Проверить истинность высказывания: «Справедливы неравенства A ≥ 0 или B < −2».
public class L4 {
    public static void main(String[] args) {
        int a = 3;
        int b = -1;

        boolean dd = (a >= 0 || b < -2);

        System.out.println("Справедливы неравенства A ≥ 0 или B < −2: " + dd);
    }
}
