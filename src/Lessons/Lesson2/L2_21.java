package Lessons.Lesson2;
import java.util.Scanner;

public class L2_21 {
    //Case8
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть день: ");
        int day = scanner.nextInt();

        System.out.print("Введіть місяць: ");
        int month = scanner.nextInt();

        if (day == 1 && month == 1) { // для дати 1 січня
            day = 31;
            month = 12;
            System.out.print("day: " + day + "; month: " + month);
        }

        else if (day == 1) { // якщо вказано день будь-якого іншого місяця
            month--;
            switch (month) {
                case 2:
                    day = 28;
                    System.out.print("day: " + day + "; month: " + month);
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    day = 30;
                    System.out.print("day: " + day + "; month: " + month);
                    break;
                default:
                    day = 31;
                    System.out.print("day: " + day + "; month: " + month);
                    break;
            }
        }

        else {
            day--;
            System.out.print("day: " + day + "; month: " + month);
        }
    }
}