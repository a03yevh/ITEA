package Homeworks.HW_Lesson9_sp.HW4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        System.out.println("Select an operation: ");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();

        try {
            switch (choice) {
                case 1:
                    int sum = calculator.add(a, b);
                    System.out.println("Result of addition: " + sum);
                    break;
                case 2:
                    int difference = calculator.sub(a, b);
                    System.out.println("Result of subtraction: " + difference);
                    break;
                case 3:
                    int product = calculator.mul(a, b);
                    System.out.println("Result of multiplication: " + product);
                    break;
                case 4:
                    double quotient = calculator.div(a, b);
                    System.out.println("Result of division: " + quotient);
                    break;
                default:
                    System.out.println("Invalid operation choice.");
            }
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}