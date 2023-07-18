package Homeworks.HW_Lesson4_sp;

/*Використовуючи IntelliJ IDEA, створіть клас Arrays. Створіть масив розмірністю 10 елементів, виведіть на екран усі елементи масиву у зворотному порядку.*/

public class HW5_Arrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}