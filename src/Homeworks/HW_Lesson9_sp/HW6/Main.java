package Homeworks.HW_Lesson9_sp.HW6;

/*Використовуючи Intelij IDEA, створити проект, пакет. Створити клас Animal з ім'ям String, int віком, хвостом Boolean.
У класі перевизначити метод toString, щоб висновок був наступним «Ім'я: Васька, вік: 45, хвіст: ні». У класі Animal
перевизначити методи equals & hashCode.*/

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Vaska", 10, false);
        System.out.println(animal1.toString());

        Animal animal2 = new Animal("Murzik", 5, true);
        System.out.println(animal2.toString());

        // Приклад використання equals() та hashCode()
        Animal animal3 = new Animal("Vaska", 10, false);
        System.out.println("animal1.equals(animal3): " + animal1.equals(animal3));
        System.out.println("animal1.hashCode(): " + animal1.hashCode());
        System.out.println("animal3.hashCode(): " + animal3.hashCode());
    }
}
