package Homeworks.HW_Lesson11_sp.HW5;

/*Необхідно створити рядок із текстом (текст взяти будь-який з інтернету). Розбити цей рядок на 2 підрядки рівної довжині та вивести на екран кожен з нового рядка.
        * Завдання із зірочкою - якщо кількість символів не парна, доповнити символом по замовчуванню. Символ любий на Ваш смак наприклад *☺︎☕︎⚓︎⚛︎
        Маємо рядок - asdfg
        Вивід:
        asd
        fg⚓︎*/

public class Main {
    public static void main(String[] args) {
        String text = "have a rest";

        int length = text.length();
        int halfLength = length / 2;

        boolean isEven = length % 2 == 0;

        if (!isEven) {
            text += "⚓︎";
            length++;
        }

        String firstHalf = text.substring(0, halfLength);
        String secondHalf = text.substring(halfLength, length);

        System.out.println(firstHalf);
        System.out.println(secondHalf);
    }
}