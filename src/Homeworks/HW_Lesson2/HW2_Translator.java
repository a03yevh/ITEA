package Homeworks.HW_Lesson2;

import java.util.Scanner;

/*Використовуючи IntelliJ IDEA, створіть клас Translator. Напишіть програму українсько-російський перекладач. Програма знає 10 слів про погоду. Потрібно, щоб
користувач вводив слово російською, а програма давала йому переклад англійською мовою. Якщо користувач ввів слово, для якого немає перекладу, слід вивести
повідомлення, що такого слова немає.*/

public class HW2_Translator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String word = "";
        System.out.print("Напишите слово: ");
        word = scanner.next();

        switch (word) {
            case "ливень":
                System.out.println("-> downpour");
                break;
            case "ветер":
                System.out.println("-> wind");
                break;
            case "метель":
                System.out.println("-> blizzard");
                break;
            case "ураган":
                System.out.println("-> hurricane");
                break;
            case "гололед":
                System.out.println("-> ice");
                break;
            case "туман":
                System.out.println("-> fog");
                break;
            case "снег":
                System.out.println("-> snow");
                break;
            case "жара":
                System.out.println("-> heat");
                break;
            case "град":
                System.out.println("-> hail");
                break;
            case "осадки":
                System.out.println("-> precipitation");
                break;
            default:
                System.out.println("Перевод для слова не найден!");
                break;
        }
    }
}
