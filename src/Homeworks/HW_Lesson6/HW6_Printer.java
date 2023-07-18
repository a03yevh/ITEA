package Homeworks.HW_Lesson6;
import java.util.Random;

/*Використовуючи IntelliJ IDEA, створіть проект. Потрібно: Створити клас Printer. У тілі класу створіть метод void print(String value), який виводить на екран значення аргументу.
Реалізуйте можливість того, щоб у разі успадкування від даного класу інших класів, та виклику відповідного методу їх екземпляра, рядки, передані як аргументи методів,
виводилися різними кольорами. Обязательно используйте приведення типів.*/

public class HW6_Printer {
    void print(String value) {
        System.out.println(value);
    }
}

class ColoredPrinter extends HW6_Printer {
    private Random random;

    ColoredPrinter() {
        random = new Random();
    }

    @Override
    void print(String value) {
        int colorCode = random.nextInt(6) + 31;  // ANSI color
        String coloredValue = "\u001B[" + colorCode + "m" + value + "\u001B[0m";
        super.print(coloredValue);
    }
}
