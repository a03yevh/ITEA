package Homeworks.HW_Lesson1;

import java.util.Scanner;

/*Використовуючи IntelliJ IDEA, створіть клас Circle. Створіть константу під назвою PI (число π «пі»),
створіть змінну радіус з назвою – r. Використовуючи формулу πR2 , обчисліть площу кола та виведіть результат на екран.*/

public class HW6_Circle {
    public static void main(String[] args) {
        final double PI = Math.PI;
        float R;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter R: ");
        R = input.nextFloat();

        System.out.print("S = " + (PI * Math.pow(R,2)));
    }
}