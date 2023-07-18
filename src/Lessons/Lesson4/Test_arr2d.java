package Lessons.Lesson4;

public class Test_arr2d {
    public static void main(String[] args) {
      int[][] arr = {{1,2,3}, {3,5,6}, {0,0,0}};
        int sum = 0;

        for (int i=0; i < arr.length; i++) {
           for (int j=0; j < arr.length; j++) {
               sum += arr[i][j];
           }
        }

        System.out.println("Sum: " + sum);

        System.out.println("\n----------------------------\n");

        int sum2 = 0;
        int[][] arr2 = {
                {1,2,3},
                {4,5},
                {6,7,8,9},
                {3,5,6}
        };

        for (int i=0; i < arr2.length; i++) {
            for (int j=0; j < arr2[i].length; j++) {
                sum2 += arr2[i][j];
            }
        }

        System.out.println("Sum2: " + sum2);
    }
}
