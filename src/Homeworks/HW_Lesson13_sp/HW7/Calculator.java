package Homeworks.HW_Lesson13_sp.HW7;

import java.util.Scanner;

/* Завдання 8: Напишіть основні арифметичні дії калькулятора, використовуючи лямбда-вирази!.*/

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Перше число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Друге число: ");
        double num2 = scanner.nextDouble();

        System.out.print("Введіть мат.знак (+, -, *, /): ");
        String operator = scanner.next();

        BinaryOperation addition = (a, b) -> a + b;
        BinaryOperation subtraction = (a, b) -> a - b;
        BinaryOperation multiplication = (a, b) -> a * b;
        BinaryOperation division = (a, b) -> (b != 0) ? a / b : Double.NaN;

        double result = 0.0;

        switch (operator) {
            case "+":
                result = performOperation(addition, num1, num2);
                break;
            case "-":
                result = performOperation(subtraction, num1, num2);
                break;
            case "*":
                result = performOperation(multiplication, num1, num2);
                break;
            case "/":
                result = performOperation(division, num1, num2);
                break;
            default:
                System.out.println("Неправильний математичний знак.");
                System.exit(1);
        }

        System.out.println("Результат: " + result);

        scanner.close();
    }

    interface BinaryOperation {
        double operate(double a, double b);
    }

    public static double performOperation(BinaryOperation operation, double num1, double num2) {
        return operation.operate(num1, num2);
    }
}
