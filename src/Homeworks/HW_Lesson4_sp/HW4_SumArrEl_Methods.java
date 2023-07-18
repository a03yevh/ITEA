package Homeworks.HW_Lesson4_sp;

/*Створіть два масиви 3х3, заповніть їх, створіть третій масив порожній. У третій масив внесіть результат додавання перших двох, використовуючи методи.*/

public class HW4_SumArrEl_Methods {
    public static void Sum3x3 (int[][] arr1, int[][] arr2, int[][] arr3) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        Visual_Sum3x3(arr3);
    }

    public static void Visual_Sum3x3(int[][] arr3) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr1 = { {1, 2, 3}, {3, 4, 4}, {1, 2, 3} };
        int[][] arr2 = { {1, 2, 3}, {3, 4, 4}, {1, 2, 3} };
        int[][] arr3 = new int [3][3];

        Sum3x3(arr1, arr2, arr3);
    }
}
