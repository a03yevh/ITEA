package Homeworks.HW_Lesson10_sp.HW0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*Виведення на екран елементів List: Створити список, заповнити його на 10 елементів та вивести на екран вміст, використовуючи iterator.*/

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            list.add(i*2);
        }

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
