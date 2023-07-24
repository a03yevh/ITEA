package Homeworks.HW_Lesson13_sp.HW0;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

/* Завдання 1: Затримка потоку.
Необхідно створити три потоки, кожних із цих потоків запустити (наприклад: main, second, first),
Вивести - поток 'NAME' стартував - 'DateTime'
Коли поток закінчив роботу - поток 'NAME' фінішував - 'DateTime'
Коли всі ці потоки успішно відпрацюють – вивести на екран повідомлення
Всі потоки завершили роботу*/

public class DelayedThreads {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {
        Thread firstThread = new Thread(new MyRunnable("first"));
        Thread secondThread = new Thread(new MyRunnable("second"));
        Thread mainThread = Thread.currentThread();

        firstThread.start();
        secondThread.start();

        printMessage(mainThread.getName(), "стартував");

        try {
            firstThread.join();
            secondThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        printMessage(mainThread.getName(), "фінішував");

        System.out.println("Всі потоки завершили роботу");
    }

    static class MyRunnable implements Runnable {
        private final String name;

        public MyRunnable(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            printMessage(name, "стартував");

            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            printMessage(name, "фінішував");
        }
    }

    private static void printMessage(String threadName, String message) {
        System.out.println("Потік '" + threadName + "' " + message + " - " + formatter.format(LocalDateTime.now()));
    }
}