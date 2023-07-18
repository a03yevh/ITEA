package Homeworks.HW_Lesson7_sp.HW1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Який варіант набору Ви хотіли б придбати ?");
            System.out.println("1 -> Ар-деко");
            System.out.println("2 -> Вікторіанській");
            System.out.println("3 -> Модерн");
            System.out.println();
            System.out.print("Ваш вибір: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            FurnitureFactory factory;

            switch (choice) {
                case 1:
                    factory = new ArtDecoFactory();
                    break;
                case 2:
                    factory = new VictorianFactory();
                    break;
                case 3:
                    factory = new ModernFactory();
                    break;
                default:
                    System.out.println("Невірний вибір. Спробуйте ще раз.");
                    System.out.println();
                    continue;
            }
            factory.createFurniture();
            System.out.println("------------------");
            System.out.println();
        }
    }
}
