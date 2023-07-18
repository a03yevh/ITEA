package Homeworks.HW_Lesson1;

/*Використовуючи IntelliJ IDEA, створіть проект із класом main.
Створіть дві цілі перемінні і виведіть на екран результати всіх арифметичних операцій над цими двома змінними.*/

public class HW0 {
    public static void main(String[] args) {
        int x = 10;
        int y = 9;

        System.out.println("+ => " + (x + y));
        System.out.println("- => " + (x - y));
        System.out.println("* => " + (x * y));
        System.out.println("/ => " + ((double)x / y));
        System.out.println("% => " + (x % y));

        int a = ++x;
        int b = --y;
        int c = x++;
        int d = y--;

        System.out.println("\na = " + a + "; b = " + b + "; c = " + c + "; d = " + d);
        
        x = x + y;
        System.out.println("\nx => " + x);
        
        y -= x;
        System.out.println("y => " + y);
        
        x *= y;
        System.out.println("x => " + x);
        
        y /= x;
        System.out.println("y => " + y);
    }
}

/* P.S. Оскільки я створив package і розбиваю всі завдання для себе зручно по частинам. Саме клас main створювати не дуже зручно,
але сподіваюсь, це не критично.*/

