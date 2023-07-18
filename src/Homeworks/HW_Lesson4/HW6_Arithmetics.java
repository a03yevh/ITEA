package Homeworks.HW_Lesson4;
import java.util.Scanner;

/*Використовуючи IntelliJ IDEA, створіть клас Arithmetics. Створіть чотири методи для виконання арифметичних операцій з іменами: add – додавання, sub – віднімання,
mul – множення, div – ділення. Кожен метод має приймати два цілих аргументи та виводити на екран результат виконання арифметичної операції відповідної
імені методу. Метод поділу div має виконувати перевірку спроби поділу на нуль. Потрібно надати користувачеві можливість вводити з клавіатури значення
операндів і знак арифметичної операції для виконання обчислень.*/

public class HW6_Arithmetics {
    public static int add (int a, int b) {
        return a+b;
    }

    public static int sub (int a, int b) {
        return a-b;
    }

    public static int mul (int a, int b) {
        return a*b;
    }

    public static int div (int a, int b) {
        return a/b;
    }

    public static int MathOperation (int a, int b, char c) {
        int res = 0;

        if (c == '/') {
            res = div(a, b);
        } else if (c == '*') {
            res = mul(a, b);
        } else if (c == '+') {
            res = add(a,b);
        } else if (c == '-') {
            res = sub(a,b);
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int n1 = scanner.nextInt();

        System.out.print("Enter num2: ");
        int n2 = scanner.nextInt();

        System.out.print("Arithmetic operation (/, *, +, -): ");
        char n3 = scanner.next().charAt(0);

        if (n3 != '+' && n3 != '-' && n3 != '*' && n3 != '/') {
            System.out.println("ERROR: Wrong Arithmetic operation!");
        } else if (n2 == 0 && n3 == '/') {
            System.out.println("ERROR: Can't divide by zero!");
        } else {
            int result = MathOperation(n1, n2, n3);
            System.out.println("Result: " + result);
        }
    }
}
