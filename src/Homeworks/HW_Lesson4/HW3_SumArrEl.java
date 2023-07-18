package Homeworks.HW_Lesson4;

/*Створіть два масиви 3х3, заповніть їх, створіть третій масив порожній. У третій масив внесіть результат додавання перших двох.*/

public class HW3_SumArrEl {
    public static void main(String[] args) {
        int[][] arr1 = { {1, 2, 3}, {3, 4, 4}, {1, 2, 3} };
        int[][] arr2 = { {1, 2, 3}, {3, 4, 4}, {1, 2, 3} };
        int[][] arr3 = new int [3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        //Visual sum arr
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
