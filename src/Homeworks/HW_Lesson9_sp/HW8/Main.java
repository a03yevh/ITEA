package Homeworks.HW_Lesson9_sp.HW8;

/*Створіть проект за допомогою IntelliJ IDEA. Створіть клас MyDictionary. Реалізуйте у найпростішому наближенні можливість
використання його екземпляра. Мінімально необхідний інтерфейс взаємодії з екземпляром повинен включати метод додавання пар
елементів, індексатор для отримання значення елемента за вказаним індексом і властивість тільки для читання для отримання
загальної кількості пар елементів.*/

public class Main {
    public static void main(String[] args) {
        MyDictionary dictionary = new MyDictionary();
        dictionary.add(0, "one");
        dictionary.add(2, "two");

        System.out.println("Number of elements in the dictionary: " + dictionary.getCount());

        String value = dictionary.getValue(1);
        System.out.println("Value at index 1: " + value);
    }
}
