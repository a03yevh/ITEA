package Homeworks.HW_Lesson4;
import java.util.Scanner;

/*Використовуючи IntelliJ IDEA, створіть клас UserArray. Створити метод, який виконуватиме збільшення довжини масиву, переданого як аргумент, на 1 елемент.
Елементи масиву мають зберегти своє значення та порядок індексів. Створити метод, який приймає два аргументи, перший аргумент типу int [] array,
другий аргумент типу int value. У тілі методу реалізуйте можливість додавання другого аргументу методу в масив за індексом 0, водночас довжина нового
масиву має збільшитися на 1 елемент, а елементи одержуваного масиву як перший аргумент мають скопіюватися в новий масив починаючи з індексу 1.*/

public class HW2_UserArray {
    //Метод для збільшення масиву на 1 ел.
    public static int[] Func1(int[] arr) {
        int[] temp_arr = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            temp_arr[i] = arr[i];
        }

        // нехай value = 3;
        return Func2(temp_arr, 3);
    }

    //Метод, який приймає два аргументи, ...
    public static int[] Func2(int[] arr2, int value) {
        int[] temp_arr2 = new int[arr2.length + 1];
        temp_arr2[0] = value;

        for (int i = 0; i < arr2.length; i++) {
            temp_arr2[i+1] = arr2[i];
        }
        return temp_arr2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int N = scanner.nextInt();

        int array[] = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Enter array [" + i + "]: ");
            array[i] = scanner.nextInt();
        }

        array = Func1(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
