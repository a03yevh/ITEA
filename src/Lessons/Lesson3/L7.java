package Lessons.Lesson3;
// Задание 8. Даны два целых числа: A, B. Проверить истинность высказывания: «Каждое из чисел A и B нечетное».
public class L7 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        boolean dd = ((a % 2 != 0) & (b % 2 != 0));

        System.out.println("Каждое из чисел A и B нечетное: " + dd);
    }
}
