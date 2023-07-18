package Homeworks.HW_Lesson11_sp.HW4;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

/*Створіть файл, запишіть у нього довільні дані та закрийте файл.
Потім знову відкрийте цей файл, прочитайте дані і виведіть їх на консоль.*/

public class Main {
    public static void main(String[] args) {
        String fileName = "data.txt";
        String data = "Hello, World!";

        try {
            File file = new File(fileName);
            FileWriter writer = new FileWriter(file);
            writer.write(data);
            writer.close();
            System.out.println("The data is written to a file.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        try {
            FileReader reader = new FileReader(fileName);
            int character;
            StringBuilder fileData = new StringBuilder();

            while ((character = reader.read()) != -1) {
                fileData.append((char) character);
            }

            reader.close();
            System.out.println("Data read from file: " + fileData.toString());
        } catch (IOException e) {
            System.out.println("Error while reading from file: " + e.getMessage());
        }
    }
}
