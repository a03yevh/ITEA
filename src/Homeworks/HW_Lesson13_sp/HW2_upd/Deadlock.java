package Homeworks.HW_Lesson13_sp.HW2_upd;

import java.util.concurrent.TimeUnit;

/* Завдання 3: Змінити завдання №2 Усі можливі способи (які Ви знаєте) вирішити проблему взаємного блокування.*/

public class Deadlock {
    public static void main(String[] args) {
        ResourceA ResourceA = new ResourceA();
        ResourceB ResourceB = new ResourceB();

        Thread threadA = new Thread(() -> {
            ResourceA.methodA(ResourceB);
        });

        Thread threadB = new Thread(() -> {
            ResourceB.methodB(ResourceA);
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