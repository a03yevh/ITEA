package Homeworks.HW_Lesson9_sp.HW4;

/*Створіть проект за допомогою IntelliJ IDEA. Створіть клас Calculator. У тілі класу створіть чотири методи для арифметичних дій:
(add – додавання, sub – віднімання, mul – множення, div – поділ). Метод поділу повинен перевірити поділ на нуль, якщо перевірка
не проходить, згенерувати виняток. Користувач вводить значення, над якими хоче зробити операцію та вибрати саму операцію.
У разі виникнення помилок повинні викидатися винятки.*/

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public double div(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed!");
        }
        return (double) a / b;
    }
}