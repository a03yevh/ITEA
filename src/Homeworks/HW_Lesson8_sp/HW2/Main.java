package Homeworks.HW_Lesson8_sp.HW2;
import java.util.ArrayList;
import java.lang.Math;
import java.util.ListIterator;

/*Використовуючи Intelij IDEA, створити проект, пакет. Створити клас Main, створити список цілих чисел і за допомогою ListIterator пройтись
по списку і збільшити значення на 1.*/

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        System.out.println("Output list:");
        //Створення списку, наприклад, з розміром 12.
        for(int i = 0; i < 12; i++) {
            list.add((int)(Math.random() * 10));
        }
        System.out.println(list);


        System.out.println("\nAfter change (+1):");
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            int currentValue = listIterator.next();
            listIterator.set(currentValue + 1);
        }
        System.out.println(list);
    }
}
