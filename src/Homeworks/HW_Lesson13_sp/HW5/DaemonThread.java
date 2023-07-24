package Homeworks.HW_Lesson13_sp.HW5;

import java.util.concurrent.TimeUnit;

/* Завдання 6: Створіть Daemon-потік і виведіть про нього якнайбільше інформації.*/
public class DaemonThread {

    public static void main(String[] args) {
        Thread daemonThread = new Thread(new MyDaemonRunnable());
        daemonThread.setDaemon(true);
        daemonThread.start();

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static class MyDaemonRunnable implements Runnable {

        @Override
        public void run() {
            System.out.println("Ім'я потоку: " + Thread.currentThread().getName());
            System.out.println("ID потоку: " + Thread.currentThread().getId());
            System.out.println("Пріорітет потоку: " + Thread.currentThread().getPriority());
            System.out.println("Daemon-потік: " + Thread.currentThread().isDaemon());
            System.out.println("Потік живой: " + Thread.currentThread().isAlive());
            System.out.println("Потік активнмй: " + Thread.currentThread().isAlive());
            System.out.println("Стан потоку: " + Thread.currentThread().getState());
        }
    }
}
