package Homeworks.HW_Lesson3;
import java.util.Scanner;

/*Є N клієнтів, яким компанія-виробник має доставити товар. Скільки є можливих маршрутів доставлення товару з урахуванням того, що товар доставлятиме одна машина?
Використовуючи IntelliJ IDEA, створіть клас Delivery. Напишіть програму, яка розраховуватиме та виводитиме на екран кількість можливих варіантів доставлення товару.
Для розв’язку задачі використовуйте факторіал N!, що розраховується за допомогою циклу do-while.*/

public class HW4_Delivery {
    public static void main(String[] args) {
        int N;
        int f = 1;
        int i = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Client(-s): ");
        N = scanner.nextInt();


        do {
            f = f * i;
            i++;
        } while (i <= N);

        System.out.print("Number of possible delivery routes: " + f);
    }
}
