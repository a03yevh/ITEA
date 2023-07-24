package Homeworks.HW_Lesson13_sp.HW3;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MultiThreadedApp {

    private static final Object lock = new Object();
    private static final List<Integer> idCollection = new ArrayList<>();
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Thread1());
        Thread thread2 = new Thread(new Thread2());
        Thread thread3 = new Thread(new Thread3());

        thread1.start();
        thread2.start();
        thread3.start();
    }

    static class Thread1 implements Runnable {
        @Override
        public void run() {
            try {
                FileWriter writer = new FileWriter("E:\\Java [Itea]\\ITEA\\src\\Homeworks\\HW_Lesson13_sp\\HW3\\result.txt", true);
                while (true) {
                    synchronized (lock) {
                        while (idCollection.isEmpty()) {
                            lock.wait();
                        }
                        int id = idCollection.remove(0);
                        String formattedDate = LocalDateTime.now().format(formatter);
                        String result = String.format("ID: %d Date: %s\n", id, formattedDate);
                        writer.write(result);
                        writer.flush();
                    }
                }
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class Thread2 implements Runnable {
        @Override
        public void run() {
            try {
                Random random = new Random();
                while (true) {
                    Thread.sleep(2000);
                    synchronized (lock) {
                        int id = random.nextInt(100);
                        idCollection.add(id);
                        lock.notifyAll();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class Thread3 implements Runnable {
        @Override
        public void run() {
            try {
                while (true) {
                    Thread.sleep(10000);
                    synchronized (lock) {
                        for (int i = 0; i < idCollection.size(); i++) {
                            int id = idCollection.get(i);
                            idCollection.remove(i);
                            i--;
                            System.out.println("ID відправника: " + id);
                        }
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
