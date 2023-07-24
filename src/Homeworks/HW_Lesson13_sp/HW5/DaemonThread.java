package Homeworks.HW_Lesson13_sp.HW5;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

/* Завдання 6: Створіть Daemon-потік і виведіть про нього якнайбільше інформації.*/

public class DaemonThread {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    private static LocalDateTime startTime;

    public static void main(String[] args) {
        Thread daemonThread = new Thread(() -> {
            try {
                startTime = LocalDateTime.now();
                while (!Thread.currentThread().isInterrupted()) {
                    System.out.println("Потік працює.....");
                    TimeUnit.SECONDS.sleep(2);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        daemonThread.setDaemon(true);
        daemonThread.start();

        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        daemonThread.interrupt();

        System.out.println("Потік закінчив роботу");

        System.out.println("");
        System.out.println("Ім'я потоку: " + daemonThread.getName());
        System.out.println("ID потоку: " + daemonThread.getId());
        System.out.println("Пріоритет потоку: " + daemonThread.getPriority());
        System.out.println("Daemon-потік: " + daemonThread.isDaemon());
        System.out.println("Потік активний: " + daemonThread.isAlive());
        System.out.println("Стан потоку: " + daemonThread.getState());
        System.out.println("Час початку роботи потоку: " + formatTime(startTime));
        System.out.println("Кінцевий початку роботи потоку: " + formatTime(LocalDateTime.now()));
        System.out.println("Сумарний час роботи потоку: " + formatDuration(startTime, LocalDateTime.now()));
        System.out.println("");
    }

    private static String formatTime(LocalDateTime dateTime) {
        return dateTime.format(formatter);
    }

    private static String formatDuration(LocalDateTime start, LocalDateTime end) {
        Duration duration = Duration.between(start, end);
        long seconds = duration.getSeconds();
        long hours = seconds / 3600;
        long minutes = (seconds % 3600) / 60;
        seconds = seconds % 60;
        return String.format("%02d:%02d:%02d", hours, minutes, (seconds + 1));
    }
}