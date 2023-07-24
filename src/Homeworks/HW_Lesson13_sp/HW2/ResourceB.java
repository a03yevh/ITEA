package Homeworks.HW_Lesson13_sp.HW2;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ResourceB {
    private final Lock lock = new ReentrantLock();

    void methodB(ResourceA ResourceA) {
        lock.lock();
        try {
            System.out.println("Виклик методу (B)");
            TimeUnit.MILLISECONDS.sleep(500);
            ResourceA.methodA(this);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}