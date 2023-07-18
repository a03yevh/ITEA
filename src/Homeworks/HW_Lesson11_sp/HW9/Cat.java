package Homeworks.HW_Lesson11_sp.HW9;
import java.lang.reflect.Field;

/*Створіть 2 класи, Animal та Cat.
        У класі Animal ініціалізуйте 3 поля різних модифікаторів.
        У класі Cat використовуючи рефлексію, отримайте доступ до полів класу Animal та змініть вміст кожного з полів.
        * Завдання із зірочкою

        Додайте модифікатори:
        Final
        Static*/

class Cat {
    public static void main(String[] args) throws Exception {
        Animal animal = new Animal();
        animal.printFields();

        Class<?> animalClass = animal.getClass();
        Field privateField = animalClass.getDeclaredField("privateField");
        Field staticField = animalClass.getDeclaredField("staticField");
        Field ageField = animalClass.getDeclaredField("age");

        privateField.setAccessible(true);
        staticField.setAccessible(true);
        ageField.setAccessible(true);

        privateField.setInt(animal, 20);
        staticField.set(null, "Hi");
        ageField.set(null, 9999);

        animal.printFields();
    }
}