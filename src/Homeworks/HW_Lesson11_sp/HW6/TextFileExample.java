package Homeworks.HW_Lesson11_sp.HW6;

import java.io.*;

/*Створіть у пакеті текстовий файл і клас, внесіть у файл якийсь текст.
Виведіть на екран вміст файлу.*/

public class TextFileExample {
    public static void main(String[] args) {
        String fileName = "data1.txt";

        try {
            File file = new File(fileName);

            String content = "This is an example text file.";

            FileWriter writer = new FileWriter(file);

            writer.write(content);

            writer.close();

            FileReader reader = new FileReader(file);

            BufferedReader bufferedReader = new BufferedReader(reader);

            String line = bufferedReader.readLine();

            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
