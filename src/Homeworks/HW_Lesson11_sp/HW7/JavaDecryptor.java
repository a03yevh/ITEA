/*
package Homeworks.HW_Lesson11_sp.HW7;

import java.io.*;
import java.nio.file.*;
import java.util.*;

*/
/*Напишіть жартівливу програму «Дешифратор», яка в текстовому файлі могла б замінити всі прийменники на слово «Java».
 * Завдання із зірочкою - перезаписати вміст файлу.*//*


public class JavaDecryptor {
    private static List<String> prepositions = Arrays.asList(
            "aboard", "about", "above", "across", "after", "against", "along", "amid", "among", "around",
            "as", "at", "before", "behind", "below", "beneath", "beside", "between", "beyond", "but",
            "by", "concerning", "considering", "despite", "down", "during", "except", "for", "from", "in",
            "inside", "into", "like", "near", "of", "off", "on", "onto", "out", "outside", "over", "past",
            "regarding", "round", "since", "through", "to", "toward", "under", "until", "up", "upon",
            "with", "within", "without"
    );

    public static void main(String[] args) {
        String fileName = "E:\\Java [Itea]\\ITEA-lessons\\src\\HomeworksHomeworks\\HW_Lesson11_sp\\HW7\\mytext.txt";
        Path filePath = Paths.get(fileName);
        try {
            //String content = Files.readString(filePath);
            for (String preposition : prepositions) {
                //content = content.replaceAll("\\b" + preposition + "\\b", "Java");
            }
           // Files.writeString(filePath, content);
            System.out.println("File successfully decrypted using Java!");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
*/
