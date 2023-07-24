package Homeworks.HW_Lesson13_sp.HW4;

/* Завдання 5: Демонстрація пріоритетів.
Створити 2 класи PriorityRunner та PriorityThread.
Запустити 3 потоки із пріоритетами (min, max, norm).
За допомогою циклу for виведемо на екран значення від 1 до 50 і вкажемо, який саме потік цю операцію робить.*/

public class Main {
    public static void main(String[] args) {
        PriorityThread minPriorityThread = new PriorityThread("min", Thread.MIN_PRIORITY);
        PriorityThread maxPriorityThread = new PriorityThread("max", Thread.MAX_PRIORITY);
        PriorityThread normPriorityThread = new PriorityThread("norm", Thread.NORM_PRIORITY);

        minPriorityThread.start();
        maxPriorityThread.start();
        normPriorityThread.start();
    }
}