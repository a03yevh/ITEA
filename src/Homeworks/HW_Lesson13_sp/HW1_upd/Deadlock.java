package Homeworks.HW_Lesson13_sp.HW1_upd;

import java.util.concurrent.TimeUnit;

/* Завдання 2: Створити 2 класи. Реалізувати взаємне блокування цих класів*/

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
            System.out.println("Взаємне блокування відбулось.");
        } else {
            System.out.println("Взаємне блокування не відбулось.");
        }

        System.exit(0);
    }
}