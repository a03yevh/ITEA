package Lessons.Lesson5;
import java.util.Scanner;

//Завдання 5 (реалізація 1). Є звичаний key-box. Йде поповнення рахунка (купюри можуть бути різні). Наприклад, я вибрав суму
//на яку хочу поповинити. Усі купюри які я буду заносити вони будуть зберігатись. Використовувати масив.
//Коли ми внесли усі гроші, програмі необхідно підрахувати загальну кількість.

public class L5 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Введіть кількість купюр, які хочете внести: ");
        int N = input.nextInt();

        int[] money = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Введіть значення купюри " + (i+1) + ": ");
            money[i] = input.nextInt();
        }


        for (int i = 0; i < N; i++) {
            sum += money[i];
        }

        System.out.println("Загальна кількість грошей: " + sum);
    }
}
