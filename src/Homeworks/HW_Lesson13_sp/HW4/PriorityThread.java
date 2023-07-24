package Homeworks.HW_Lesson13_sp.HW4;

class PriorityThread extends Thread {
    PriorityThread(String name, int priority) {
        super(new PriorityRunner(name));
        setPriority(priority);
    }
}