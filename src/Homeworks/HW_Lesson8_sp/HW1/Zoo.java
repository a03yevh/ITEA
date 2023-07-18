package Homeworks.HW_Lesson8_sp.HW1;
import java.util.ArrayList;

/*Використовуючи Intelij IDEA, створити проект, пакет. Використовуючи клас Zoo Завдання 2, видалити 3, 5, 7 тварин, дізнатися розмір списку і вивести в консоль.*/

public class Zoo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add(0, "Lion"); // 1 тварина
        list.add(1, "Tiger"); // 2 тварина
        list.add(2, "Elephant"); // 3 тварина
        list.add(3, "Giraffe"); // 4 тварина
        list.add(4, "Monkey"); // 5 тварина
        list.add(5, "Dolphin"); // 6 тварина
        list.add(6, "Penguin"); // 7 тварина
        list.add(7, "Kangaroo"); // 8 тварина

        System.out.println("Size: " + list.size());

        for(String s : list) {
            System.out.println(s);
        }

        list.remove("Elephant"); // 3 тварина
        list.remove("Monkey"); // 5 тварина
        list.remove("Penguin"); // 7 тварина


        System.out.println("\nUpdated size: " + list.size());

        for(String s : list) {
            System.out.println(s);
        }
    }
}