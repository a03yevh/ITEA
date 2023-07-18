package Homeworks.HW_Lesson9_sp.HW1;

/*Створіть проект за допомогою IntelliJ IDEA. Створіть перерахунковий тип (enum) Animals, що містить конструктор, який повинен набувати
цілого числа (вік тварини), і містити перевантажений метод toString(), який повинен повертати назву екземпляра та вік тварини.*/
public class Main {
    public static void main(String[] args) {
        Animals myAnimal = Animals.DOG;
        System.out.println(myAnimal.toString());

        int animalAge = Animals.CAT.ordinal() + 1;
        Animals newAnimal = Animals.values()[animalAge];
        System.out.println(newAnimal.toString());
    }
}