package Homeworks.HW_Lesson9_sp.HW7;

/*Створіть проект за допомогою IntelliJ IDEA. Створіть клас MyList. Реалізуйте у найпростішому наближенні можливість
використання його екземпляра аналогічно екземпляру класу List. Мінімально необхідний інтерфейс взаємодії з екземпляром
повинен включати метод додавання елемента, індексатор для отримання значення елемента за вказаним індексом і властивість
тільки для читання для отримання загальної кількості елементів.*/

public class Main {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();
        myList.add("Element 1");
        myList.add("Element 2");
        myList.add("Element 3");

        System.out.println("Size: " + myList.getSize());

        System.out.println(myList.get(1));
    }
}
