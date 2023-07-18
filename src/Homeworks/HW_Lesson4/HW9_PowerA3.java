package Homeworks.HW_Lesson4;
import java.lang.Math;

/*Опишіть метод PowerA3(A, B), який обчислює третій ступінь числа A і повертає її до змінної B (A – вхідний, B – вихідний параметр; обидва параметри є дійсними).
За допомогою цієї процедури знайдіть третій ступінь п'яти зазначених чисел.*/

public class HW9_PowerA3 {
    public static double PowerA3(double A, double B) {
        B = Math.pow(A, 3);

        return B;
    }

    public static void main(String[] args) {
        double res;

        double num1 = 1;
        res = PowerA3(num1, 0);
        System.out.println(res);

        double num2 = 1.2;
        res = PowerA3(num2, 0);
        System.out.println(res);

        double num3 = 3;
        res = PowerA3(num3, 0);
        System.out.println(res);

        double num4 = 5;
        res = PowerA3(num4, 0);
        System.out.println(res);

        double num5 = 7.45;
        res = PowerA3(num5, 0);
        System.out.println(res);
    }
}
