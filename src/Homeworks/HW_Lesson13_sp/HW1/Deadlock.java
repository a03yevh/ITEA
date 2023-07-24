package Homeworks.HW_Lesson13_sp.HW1;

import java.util.concurrent.TimeUnit;

public class Deadlock {
    public static void main(String[] args) {
        ResourceA resourceA = new ResourceA();
        ResourceB resourceB = new ResourceB();

        Thread threadA = new Thread(() -> {
            resourceA.methodA(resourceB);
        });

        Thread threadB = new Thread(() -> {
            resourceB.methodB(resourceA);
        });

        threadA.start();
        threadB.start();

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (threadA.getState() == Thread.State.BLOCKED || threadB.getState() == Thread.State.BLOCKED) {
            System.out.println("Взаємне блокування відбулось!");
        } else {
            System.out.println("Взаємного блокування не відбулось!");
        }

        System.exit(0);
    }
}