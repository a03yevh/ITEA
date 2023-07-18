package Homeworks.HW_Lesson3;

/*Використовуючи IntelliJ IDEA, створіть клас Rectangle. Створіть дві цілочислові змінні та задайте їм деякі значення. Застосовуючи техніку вкладених циклів,
намалюйте прямокутник із зірочок. Використовуйте значення раніше створених змінних для вказівки висоти та ширини прямокутника.*/

public class HW8_Rectangle {
    public static void main(String[] args) {
        int height = 3;
        int width = 15;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
