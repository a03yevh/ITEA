package Homeworks.HW_Lesson1;

/*Дано 3 змінні типу int x = 10, y = 12 і z = 3; Виконайте та розрахуйте результат наступних операцій для цих змінних:
 x += y - x++ * z;
 z = --x - y * 5;
 y /= x + 5% z;
 z = x++ + y * 5;
 x = y - x++ * z;*/

public class HW4 {
    public static void main(String[] args) {
        int x = 10;
        int y = 12;
        int z = 3;

        System.out.println("Result 'x += y - x++ * z' => " + (x += y - x++ * z)); // x = 10 + (12 - 10 * 3) = -8.

        System.out.println("Result 'z = --x - y * 5' => " + (z = --x - y * 5)); // z = (-8 - 1) - 12 * 5 = -9 - 12 * 5 = -69.

        System.out.println("Result 'y /= x + 5% z' => " + (y /= x + 5 % z)); // y = 12 / (-9 + (5 % (-69)) = 12 / -9+5 = -3.

        System.out.println("Result 'z = x++ + y * 5' => " + (z = x++ + y * 5)); // z = -9 + (-3) * 5 = -24.

        System.out.println("Result 'x += y - x++ * z' => " + (x += y - x++ * z)); // x = -8 + (-3 - (-8) * (-24)) = -203.
    }
}
