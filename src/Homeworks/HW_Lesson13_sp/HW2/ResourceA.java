package Homeworks.HW_Lesson13_sp.HW2;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ResourceA {
    private final Lock lock = new ReentrantLock();

    void methodA(ResourceB ResourceB) {
        lock.lock();
        try {
            System.out.println("Виклик методу (A)");
            TimeUnit.MILLISECONDS.sleep(500);
            ResourceB.methodB(this);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}