package Homeworks.HW_Lesson5_sp;

/*Створити клас "Матриця".
        Клас повинен мати такі змінні:
        1. двовимірний масив речових чисел;
        2. кількість рядків та стовпців у матриці.

        Клас повинен мати такі методи:
        1. додавання двовимірного масиву до двовимірного масиву;
        2. множення двовимірного масиву на число;
        3. виведення на друк обʼєкту Матриця;
        4. виведення на друк двовимірного масив після операцій над ним;
        5. множення двовимірного масиву на двовимірний масив.*/

public class HW2_Matrix {
    private double[][] data;
    private int rows;
    private int columns;

    public HW2_Matrix(double[][] data) {
        this.data = data;
        this.rows = data.length;
        this.columns = data[0].length;
    }

    public void add(HW2_Matrix other) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                this.data[i][j] += other.data[i][j];
            }
        }
    }

    public void multiply(double scalar) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                this.data[i][j] *= scalar;
            }
        }
    }

    public void multiply(HW2_Matrix other) {
        double[][] result = new double[this.rows][other.columns];

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < other.columns; j++) {
                for (int k = 0; k < this.columns; k++) {
                    result[i][j] += this.data[i][k] * other.data[k][j];
                }
            }
        }

        this.data = result;
        this.columns = other.columns;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sb.append(data[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        double[][] array1 = {{1.0, 2.0}, {3.0, 4.0}};
        double[][] array2 = {{5.0, 6.0}, {7.0, 8.0}};

        HW2_Matrix matrix1 = new HW2_Matrix(array1);
        HW2_Matrix matrix2 = new HW2_Matrix(array2);

        matrix1.add(matrix2);
        System.out.println(matrix1);
    }
}