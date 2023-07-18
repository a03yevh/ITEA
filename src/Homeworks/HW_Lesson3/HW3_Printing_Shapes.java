package Homeworks.HW_Lesson3;

/*Використовуючи IntelliJ IDEA, створіть клас Printing_Shapes. Використовуючи цикли та метод: System.out.print("*"), System.out.print(" "),
System.out.print("\n") (для переходу на новий рядок). Виведіть на екран:
        · прямокутник;
        · прямокутний трикутник;
        · рівносторонній трикутник;
        · ромб.*/

public class HW3_Printing_Shapes {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 25;

        System.out.println("\n--------------------------\n");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.println("\n--------------------------\n");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.println("\n--------------------------\n");

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n--------------------------\n");

        //Ромб:
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n--------------------------\n");
    }
}
