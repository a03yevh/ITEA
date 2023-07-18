package Homeworks.HW_Lesson9_sp.HW9;

import java.util.List;

/*Створіть проект за допомогою IntelliJ IDEA. Створіть клас MyClass, що містить статичний фабричний метод - T factoryMethod(),
який породжуватиме екземпляри типу, зазначеного як параметр типу (покажчика місця заповнення типом – Т).*/


public class Main {
    public static void main(String[] args) {
        List<String> names = MyClass.factoryMethod();
        List<Integer> ages = MyClass.factoryMethod();
    }
}