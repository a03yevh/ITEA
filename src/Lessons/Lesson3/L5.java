package Lessons.Lesson3;
// Задание 6. Даны три целых числа: A, B, C. Проверить истинность высказывания: «Справедливо двойное неравенство A < B < C».
public class L5 {
    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        int c = 0;

        boolean dd = (a < b & b < c);

        System.out.println("Справедливо двойное неравенство A < B < C: " + dd);
    }
}
