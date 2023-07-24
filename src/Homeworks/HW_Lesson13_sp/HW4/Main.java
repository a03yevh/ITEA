package Homeworks.HW_Lesson13_sp.HW4;

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