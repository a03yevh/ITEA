package Homeworks.HW_Lesson10_sp.HW1;

import java.util.Arrays;

/*У папці з прикладами ex_004_comparable. Дописати логіку, щоб метод compareTo() здійснив пошук за швидкістю (якщо ж швидкість у 2-х об'єктів дорівнює, то шукаємо за
ціною) -> ціною -> моделі -> кольору машини.*/

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car(190, 8000, "Mercedea", "Redb");
        Car c2 = new Car(190, 8000, "Mercedesb", "Reda");
        Car c3 = new Car(220, 10000, "Mercedes", "White");
        Car c4 = new Car(230, 10000, "Mercedes", "Green");
        Car c5 = new Car(190, 8000, "Mercedesb", "Redb");
        Car[] c = new Car[5];
        c[0] = c1;
        c[1] = c2;
        c[2] = c3;
        c[3] = c4;
        c[4] = c5;

        System.out.println(Arrays.toString(c));
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));
    }
}
