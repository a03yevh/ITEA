package Homeworks.HW_Lesson12_sp.HW0;

// Завдання 1: Необхідно здійснити десеріалізацію з файлу будь якого файлу(класу) та вивести на екран вміст.

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Jack Av", 20);
        String filename = "E:\\Java [Itea]\\ITEA\\src\\Homeworks\\HW_Lesson12_sp\\HW0\\person.ser";

        Serializer.serializeToFile(person, filename);

        Person deserializedPerson = Deserializer.deserializeFromFile(filename);

        System.out.println(deserializedPerson);
    }
}