package Lessons.Lesson3;

//Завдання 2. Дано целое число A. Проверить истинность высказывания: «Число A является нечетным».
public class L1 {
    public static void main(String[] args) {
        int a = 5;

        boolean odd = (a % 2 != 0);

        System.out.println("Число A является нечетным: " + odd);
    }

}
