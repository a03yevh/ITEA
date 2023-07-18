package Lessons.Lesson3;
// Задание 3. Дано целое число A. Проверить истинность высказывания: «Число A является четным».
public class L2 {
    public static void main(String[] args) {
        int a = 5;

        boolean odd = (a % 2 == 0);

        System.out.println("Число A является четным: " + odd);
    }
}
