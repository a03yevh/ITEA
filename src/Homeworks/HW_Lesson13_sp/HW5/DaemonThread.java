package Homeworks.HW_Lesson13_sp.HW5;

/* Завдання 6: Створіть Daemon-потік і виведіть про нього якнайбільше інформації.*/

public class DaemonThread {
    public static void main(String[] args) {
        Thread daemonThread = new Thread(() -> {
            try {
                while (true) {
                    Thread.sleep(1000);
                    System.out.println("Daemon-потік виконується...");
                }
            } catch (InterruptedException e) {
                System.out.println("Daemon-потік був перерваний.");
            }
        });

        daemonThread.setName("Мій Daemon-потік");
        daemonThread.setDaemon(true);
        daemonThread.start();

        // Информация о потоке:
        System.out.println("Ім'я потоку: " + daemonThread.getName());
        System.out.println("ID потоку: " + daemonThread.getId());
        System.out.println("Приоритет потоку: " + daemonThread.getPriority());
        System.out.println("Daemon-потік: " + daemonThread.isDaemon());
        System.out.println("Потік живий: " + daemonThread.isAlive());
        System.out.println("Потік активний: " + daemonThread.isAlive());
        System.out.println("Потік в стані очікування: " + daemonThread.getState());
        System.out.println("");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        daemonThread.interrupt();
    }
}
