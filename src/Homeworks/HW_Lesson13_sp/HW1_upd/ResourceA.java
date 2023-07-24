package Homeworks.HW_Lesson13_sp.HW1_upd;

import java.util.concurrent.TimeUnit;

class ResourceA {
    synchronized void methodA(ResourceB resourceB) {
        System.out.println("Виклик методу (A)");
        try {
            TimeUnit.MILLISECONDS.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        resourceB.methodB(this);
    }
}