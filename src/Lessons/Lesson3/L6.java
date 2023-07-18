package Lessons.Lesson3;
// Задание 7. Даны три целых числа: A, B, C. Проверить истинность высказывания: «Число B находится между числами A и C».
public class L6 {
    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        int c = 5;

        boolean dd = (a < b & b < c);

        System.out.println("Число B находится между числами A и C: " + dd);
    }
}
