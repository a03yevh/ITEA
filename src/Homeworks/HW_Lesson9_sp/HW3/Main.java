package Homeworks.HW_Lesson9_sp.HW3;

import java.util.Arrays;
import java.util.Scanner;

/*Створіть проект за допомогою IntelliJ IDEA. Потрібно: Описати клас з іменем Price, що містить такі поля:
         назву товару;
         назву магазину, в якому продається товар;
         вартість товару у гривнях.

        Написати програму, яка виконує такі дії:
         введення з клавіатури даних до масиву, що складається з двох елементів типу Price (записи мають бути
        впорядковані в алфавітному порядку за назвами магазинів);
         виведення на екран інформації про товари, що продаються в магазині, назва якого введена з клавіатури (
        якщо такого магазину немає, вивести виняток).*/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Price[] prices = new Price[2];

        for (int i = 0; i < prices.length; i++) {
            System.out.println("Enter the name of the product:");
            String productName = scanner.nextLine();

            System.out.println("Enter the name of the store:");
            String storeName = scanner.nextLine();

            System.out.println("Enter the price of the product:");
            double price = scanner.nextDouble();
            scanner.nextLine();

            prices[i] = new Price(productName, storeName, price);
        }

        Arrays.sort(prices);

        System.out.println("Enter the store name to search:");
        String searchStore = scanner.nextLine();

        boolean found = false;

        for (Price price : prices) {
            if (price.getStoreName().equalsIgnoreCase(searchStore)) {
                System.out.println("Goods: " + price.getProductName());
                System.out.println("Price: " + price.getPrice());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No store found.");
        }
    }
}