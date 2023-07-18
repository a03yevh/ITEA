package Homeworks.HW_Lesson4;

/*Використовуючи IntelliJ IDEA, створіть клас Bank. Уявіть, що ви реалізуєте програму для банку, яка допомагає визначити, погасив клієнт кредит чи ні.
Припустимо, щомісячна сума платежу має становити 100 грн. Клієнт має виконати 7 платежів, але може платити рідше великими сумами. Тобто може двома
платежами по 300 і 400 грн закрити весь борг. Створіть метод, який як аргумент прийматиме суму платежу, введену економістом банку. Метод виводить на
екран інформацію про стан кредиту (сума заборгованості, сума переплат, повідомлення про відсутність боргу).*/

public class HW11_Bank {
    private double balance; // сума заборгованості
    private double overpayment; // сума переплат
    private int remainingPayments; // кількість залишилися платежів

    public HW11_Bank(double balance, double overpayment, int remainingPayments) {
        this.balance = balance;
        this.overpayment = overpayment;
        this.remainingPayments = remainingPayments;
    }

    public void makePayment(double paymentAmount) {
        if (balance <= 0) {
            System.out.println("Борг повністю погашено.");
            return;
        }

        double monthlyPayment = 100; // щомісячна сума платежу
        if (paymentAmount < monthlyPayment) {
            System.out.println("Сума платежу недостатня. Будь ласка, спробуйте ще раз.");
            return;
        }

        balance -= paymentAmount;
        overpayment += (paymentAmount - monthlyPayment);
        remainingPayments--;

        if (balance <= 0) {
            System.out.println("Борг повністю погашено.");
            System.out.println("Загальна сума переплат: " + overpayment + " грн.");
        } else {
            System.out.println("Залишилося сплатити: " + balance + " грн.");
            System.out.println("Загальна сума переплат: " + overpayment + " грн.");
            System.out.println("Кількість залишилися платежів: " + remainingPayments);
        }
    }
}
