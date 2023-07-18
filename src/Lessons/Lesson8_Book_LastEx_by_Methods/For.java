package Lessons.Lesson8_Book_LastEx_by_Methods;

public class For {
    public static void For1(int k, int n) {
        for (int i = 0; i < n-1; i++) {
            System.out.println(k);
        }
    }

    public static void For2(int a, int b) {
        for (int i = a; i <= b; i++) {
            System.out.println(i);
        }
        System.out.println("Amount of numbers: " + (b - a + 1));
    }

    public static void For3(int a, int b) {
        for (int i = b - 1; i > a; i--) {
            System.out.println(i);
        }
        System.out.println("Amount of numbers: " + (b - a - 1));
    }

    public static void For4() {
        double price = 10.50;
        double total = 0.0;

        for (int i = 1; i <= 10; i++) {
            total = i * price;
            System.out.println("Price of " + i + " kg of candys: " + total);
        }
    }

    public static void For5() {
        double price = 10.50;
        double total = 0.0;

        for (double i = 0.1; i <= 1.0; i += 0.1) {
            total = i * price;
            System.out.println("Price of " + i + " kg of candys: " + total);
        }
    }

    public static void For6() {
        double price = 10.50;
        double total = 0.0;

        for (double i = 1.2; i <= 2.0; i += 0.2) {
            total = i * price;
            System.out.println("Price of " + i + " kg of candys: " + total);
        }
    }

    public static void For7(int a, int b) {
        int c = 0;
        for (int i = a; i <= b; i++) {
            c = c + i;
        }
        System.out.println("Result: " + c);
    }

    public static void main(String[] args) {
        For1(2,5);
        System.out.println("\n================\n");
        For2(2,5);
        System.out.println("\n================\n");
        For3(2,5);
        System.out.println("\n================\n");
        For4();
        System.out.println("\n================\n");
        For5();
        System.out.println("\n================\n");
        For6();
        System.out.println("\n================\n");
        For7(2,4);
        System.out.println("\n================\n");
    }
}
