package Homeworks.HW_Lesson4_sp;

/*Використовуючи IntelliJ IDEA, створіть клас Bank. Уявіть, що ви реалізуєте програму для банку, яка допомагає визначити, погасив клієнт кредит чи ні.
Припустимо, щомісячна сума платежу має становити 100 грн. Клієнт має виконати 7 платежів, але може платити рідше великими сумами. Тобто може двома
платежами по 300 і 400 грн закрити весь борг. Створіть метод, який як аргумент прийматиме суму платежу, введену економістом банку. Метод виводить на
екран інформацію про стан кредиту (сума заборгованості, сума переплат, повідомлення про відсутність боргу). -----> [MAIN]*/

public class HW11_Bank_Main {
    public static void main(String[] args) {
        HW11_Bank client1 = new HW11_Bank(500, 0, 7); // баланс 500 грн., немає переплат, 7 платежів залишилось

        // платіж на 300 грн.
        System.out.println("Клієнт 1. Платіж на 300 грн.");
        client1.makePayment(300);
        System.out.println();

        // платіж на 150 грн.
        System.out.println("Клієнт 1. Платіж на 150 грн.");
        client1.makePayment(150);
        System.out.println();

        // платіж на 400 грн.
        System.out.println("Клієнт 1. Платіж на 400 грн.");
        client1.makePayment(400);
        System.out.println();

        // платіж на 100 грн.
        System.out.println("Клієнт 1. Платіж на 100 грн.");
        client1.makePayment(100);
        System.out.println();
    }
}