package Homeworks.HW_Lesson6;

/*Використовуючи IntelliJ IDEA, створіть проект. Потрібно: Створити клас DocumentWorker. У тілі класу створіть три методи openDocument(), editDocument(), saveDocument().
У тілі кожного з методів додайте виведення на екран відповідних рядків: "Документ відкритий", "Правка документа доступна у версії Про", "Збереження документа доступне " +
"у версії Про". Створіть похідний клас ProDocumentWorker. Перевизначте відповідні методи, при перевизначенні методів виводьте наступні рядки: "Документ відредаговано",
"Документ збережено у старому форматі, збереження в інших форматах доступне у версії Експерт". Створіть похідний клас ExpertDocumentWorker від базового класу
ProDocumentWorker. Перевизначте відповідний метод. При викликі даного методу необхідно виводити на екран документ збережений в новому форматі. У тілі методу main()
реалізуйте можливість прийому від користувача номер ключа доступу pro і exp. Якщо користувач не вводить ключ, він може користуватися тільки безкоштовною версією
(створюється екземпляр базового класу), якщо користувач ввів номери ключа доступу pro і exp, то повинен створити екземпляр відповідної версії класу, наведений до базового
– DocumentWorker.*/

public class HW4_DocumentWorker {
    public void openDocument() {
        System.out.println("The document is open");
    }

    public void editDocument() {
        System.out.println("Document editing is available in the Pro version");
    }

    public void saveDocument() {
        System.out.println("Document saving is available in the Pro version");
    }
}

class ProDocumentWorker extends HW4_DocumentWorker {
    @Override
    public void editDocument() {
        System.out.println("The document has been edited");
    }

    @Override
    public void saveDocument() {
        System.out.println("The document is saved in the old format, saving in other formats is available in the Expert version");
    }
}

class ExpertDocumentWorker extends ProDocumentWorker {
    @Override
    public void saveDocument() {
        System.out.println("The document is saved in a new format");
    }
}
