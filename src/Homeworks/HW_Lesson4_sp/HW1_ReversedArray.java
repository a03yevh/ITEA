package Homeworks.HW_Lesson4_sp;
import java.util.Arrays;

/*Використовуючи IntelliJ IDEA, створіть клас ReversedArray. Створити метод myReverse(int [] array), який приймає як аргумент масив цілочислових елементів і повертає
інвертований масив (елементи масиву у зворотному порядку). Створити метод int [] subArray (int [] array, int index, int count). Метод повертає частину
отриманого як аргумент масиву, починаючи з позиції, яка зазначена в аргументі index, розмірністю, що відповідає значенню аргументу count. Якщо аргумент
count містить значення більше, ніж кількість елементів, що входять до частини вихідного масиву (від зазначеного індексу index до індексу останнього елемента),
то під час формування нового масиву розмірністю в count, заповніть одиницями ті елементи, які не були скопійовані з вихідного масиву.*/

public class HW1_ReversedArray {
    public static int[] myReverse(int[] array) {
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - i - 1];
        }
        return reversedArray;
    }

    public static int[] subArray(int[] array, int index, int count) {
        int[] subArray = new int[count];
        for (int i = 0; i < count; i++) {
            if (index + i < array.length) {
                subArray[i] = array[index + i];
            } else {
                subArray[i] = 1;
            }
        }
        return subArray;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] reversedArray = myReverse(array);
        int[] subArray = subArray(array, 2, 4);
        System.out.println(Arrays.toString(reversedArray));
        System.out.println(Arrays.toString(subArray));
    }
}
