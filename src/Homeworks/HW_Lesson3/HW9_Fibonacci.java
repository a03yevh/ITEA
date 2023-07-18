package Homeworks.HW_Lesson3;
import java.util.Scanner;

/*Знайдіть послідовність Фібоначчі. Одне стартове число користувач вводить, друге вводить користувач до шуканого.*/

public class HW9_Fibonacci {
    public static void main(String[] args){
        int a = 1;
        int b = 3;
        int c;
        
        System.out.print(a + " " + b + " ");
        for(int i = 3; i <= 11; i++){
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println();
    }
}
