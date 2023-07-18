package Homeworks.HW_Lesson1;

import java.math.BigDecimal;

//Використовуючи IntelliJ IDEA, створіть проект.
//Дано значення числа pi, яке дорівнює 3,141592653 та значення числа Ейлера е,
//яке дорівнює 2,7182818284590452. Створіть дві змінні, надайте їм значення
//числа pi та числа е та виведіть їх на екран без втрати точності. Можна прикріпити
//файл завдання або написати код програми у відповідь.

public class HW1 {
    public static void main(String[] args) {
        double pi = 3.141592653;
        BigDecimal e = new BigDecimal("2.7182818284590452");

        System.out.println("PI = " + pi);
        System.out.print("e = " + e);
    }
}
