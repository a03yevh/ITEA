package Homeworks.HW_Lesson4;
import java.lang.Math;

/*Опишіть метод PowerA234(A, B, C, D), який обчислює другий, третій і четвертий ступінь числа A і повертає ці ступені відповідно до змінних B, C і D
(A – вхідний, B, C, D – вихідні параметри; усі параметри є дійсними). За допомогою цієї процедури знайдіть другий, третій і четвертий ступені п'яти
зазначених чисел.*/

public class HW9_PowerA3_1 {
    public static String PowerA3(double A, double B, double C, double D) {
        B = Math.pow(A, 2);
        C = Math.pow(A, 3);
        D = Math.pow(A, 4);

        return "B - " + B + ", C - " + C + ", D - " + D;
    }

    public static void main(String[] args) {
        String res;

        double num1 = 1;
        res = PowerA3(num1, 0, 0, 0);
        System.out.println(res);

        double num2 = 5;
        res = PowerA3(num2, 0, 0, 0);
        System.out.println(res);

        double num3 = 3.2;
        res = PowerA3(num3, 0, 0, 0);
        System.out.println(res);
    }
}
