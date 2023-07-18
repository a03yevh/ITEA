package Homeworks.HW_Lesson11_sp.HW0;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Використовуючи колекцію, підвійте слово:
        1. Введіть із клавіатури 5 слів до списку рядків.
        2. Метод doubleValues повинен підвоювати слова за принципом a, b, c -> a, a, b, b, c, c.
        3. Використовуючи цикл for виведіть результат на екран, кожне значення нового рядка.*/

public class DoubleWords {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 words:");
        for (int i = 0; i < 5; i++) {
            String word = scanner.nextLine();
            words.add(word);
        }

        List<String> doubledWords = doubleValues(words);

        System.out.println("Doubled words:");
        for (String word : doubledWords) {
            System.out.println(word);
        }
    }

    public static List<String> doubleValues(List<String> words) {
        List<String> doubledWords = new ArrayList<>();
        for (String word : words) {
            doubledWords.add(word);
            doubledWords.add(word);
        }
        return doubledWords;
    }
}
