package Lessons.Lesson5;

//Завдання 3. Методи на знаходження мін макс. Використання return.

public class L3 {
    public static String maxValue(int a, int b) {
        if (a > b) {
            return "a > b";
        } else if (a < b) {
            return "a < b";
        } else {
            return "a = b";
        }
    }

    public static String maxValue(double a, int b) {
        if (a > b) {
            return "a > b";
        } else if (a < b) {
            return "a < b";
        } else {
            return "a = b";
        }
    }

    public static String maxValue(int a, double b) {
        if (a > b) {
            return "a > b";
        } else if (a < b) {
            return "a < b";
        } else {
            return "a = b";
        }
    }

    public static String maxValue(double a, double b) {
        if (a > b) {
            return "a > b";
        } else if (a < b) {
            return "a < b";
        } else {
            return "a = b";
        }
    }

    public static void main(String[] args) {
        String res1 = maxValue(3,4.0);
        String res2 = maxValue(3,1);

        System.out.println(res1);
        System.out.println(res2);
    }
}
