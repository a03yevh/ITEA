package Homeworks.HW_Lesson13_sp.HW4;

class PriorityRunner implements Runnable {
    private String name;

    PriorityRunner(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.println("Потік " + name + ": " + i);
        }
    }
}