package Homeworks.HW_Lesson12_sp.HW1;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.FileWriter;

// Завдання 2: Створіть клас, використовуючи SAXParser, де опишіть ієрархію XML файлу. Необхідно, щоб проект створював XML-файл і будував дерево (місто,
// назва вулиці, будинок). У місті використовуйте аттрибут (наприклад, <city size=”big>Kiev</city>).

public class Main {
    public static void main(String[] args) {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            XMLHandler handler = new XMLHandler();
            saxParser.parse(new File("E:\\Java [Itea]\\ITEA\\src\\Homeworks\\HW_Lesson12_sp\\HW1\\input.xml"), handler);

            FileWriter writer = new FileWriter("E:\\Java [Itea]\\ITEA\\src\\Homeworks\\HW_Lesson12_sp\\HW1\\output.xml");
            writer.write(handler.getFileContent());
            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
