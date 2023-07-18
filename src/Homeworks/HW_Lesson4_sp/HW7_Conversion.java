package Homeworks.HW_Lesson4_sp;
import java.util.Scanner;

/*Використовуючи IntelliJ IDEA, створіть клас Conversion. Напишіть програму, яка конвертуватиме валюти. Користувач вводить:
        1)      суму грошей у певній валюті;
        2)      курс конвертації в іншу валюту.
Організуйте виведення результату операції конвертування валюти на екран.*/

public class HW7_Conversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount in the original currency: ");
        double amount = scanner.nextDouble();

        System.out.print("Enter the conversion rate: ");
        double rate = scanner.nextDouble();

        double convertedAmount = amount * rate;

        System.out.printf("%.2f in the original currency is equivalent to %.2f in the new currency.", amount, convertedAmount);
    }
}
