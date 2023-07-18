package Homeworks.HW_Lesson11_sp.HW2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*Програма визначає, яка сім'я (прізвище) живе у місті:
        Приклад введення:
        · Москва
        · Іванови
        · Київ
        · Петрови
        · Лондон
        · Абрамовичі


        Приклад введення:
        · Лондон

        Приклад виведення:
        · Абрамовичі*/

public class CityFamily {
    public static void main(String[] args) {
        Map<String, String> cityFamilyMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the city-surname pairs (Enter 'done' to finish):");
        while (true) {
            String city = scanner.nextLine();
            if (city.equals("done")) {
                break;
            }
            String surname = scanner.nextLine();
            cityFamilyMap.put(city, surname);
        }

        System.out.print("Enter a city to find the corresponding surname:");
        String cityToFind = scanner.nextLine();

        String surname = cityFamilyMap.get(cityToFind);
        if (surname != null) {
            System.out.println("Surname in " + cityToFind + ": " + surname);
        } else {
            System.out.println("No surname found for " + cityToFind);
        }
    }
}
