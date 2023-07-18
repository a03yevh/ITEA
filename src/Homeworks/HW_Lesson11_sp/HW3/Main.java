package Homeworks.HW_Lesson11_sp.HW3;

import java.util.Scanner;

/*Вводити з клавіатури рядки, доки користувач не введе рядок 'end':
        1. Створити перелік рядків.
        2. Ввести рядки з клавіатури та додати їх до списку.
        3. Вводити з клавіатури рядки, доки користувач не введе рядок "end". "end" не враховувати.
        4. Вивести рядки на екран, кожен з нового рядка.*/

public class Main {
    public static void main(String[] args) {
        String text = "";
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }

            text += input + "\n";
        }

        System.out.println(text);
    }
}
