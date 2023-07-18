package Homeworks.HW_Lesson1;

import java.util.Scanner;

/*Використовуючи IntelliJ IDEA, створіть клас Volume.
Напишіть програму розрахунку об'єму - V та площі поверхні - S циліндра. Об'єм V циліндра радіусом – R та висотою – h, обчислюється за формулою:
V = πR2 h Площа S поверхні циліндра обчислюється за формулою: S = 2πR2 + 2πR2 = 2πR(R+h) Результати розрахунків виведіть на екран.*/

public class HW7_Volume {
    public static void main(String[] args) {
        float R, h;
        final double PI = Math.PI;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter R: ");
        R = input.nextFloat();

        System.out.print("Enter h: ");
        h = input.nextFloat();

        System.out.println("S => " + (2 * PI * R * (R + h)));
        System.out.println("V => " + (PI * Math.pow(R, 2) * h));
    }
}