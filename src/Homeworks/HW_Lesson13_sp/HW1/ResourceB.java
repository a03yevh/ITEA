package Homeworks.HW_Lesson13_sp.HW1;

import java.util.concurrent.TimeUnit;

class ResourceB {
    synchronized void methodB(ResourceA resourceA) {
        System.out.println("Виклик методу B");
        try {
            TimeUnit.MILLISECONDS.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        resourceA.methodA(this);
    }
}