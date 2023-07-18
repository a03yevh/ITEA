package Homeworks.HW_Lesson9_sp.HW9;

import java.util.ArrayList;
import java.util.List;

class MyClass {
    public static <T> List<T> factoryMethod() {
        return new ArrayList<>();
    }
}