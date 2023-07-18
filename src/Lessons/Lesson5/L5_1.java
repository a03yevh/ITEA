package Lessons.Lesson5;

//Завдання 5 (реалізація 2). Є звичаний key-box. Йде поповнення рахунка (купюри можуть бути різні). Наприклад, я вибрав суму
//на яку хочу поповинити. Усі купюри які я буду заносити вони будуть зберігатись. Використовувати масив.
//Коли ми внесли усі гроші, програмі необхідно підрахувати загальну кількість. Також реалізувати проценти.

public class L5_1 {

    public static double calcPercent(int[] deposit) {
        int count_deposit = 0;
        int res = array(deposit);

        double percent = res * 0.05;

        return percent;
    }

    public static double calcTotal(int[] deposit) {
        double total = (array(deposit)) - calcPercent(deposit);
        return total;
    }

   static int array(int[] myArray) {
       int sum = 0;
       for (int i = 0; i < myArray.length; i++) {
           sum += myArray[i];
       }
       return sum;
   }

    public static void main(String[] args) {
        int[] array1 = {100,200,300,400,500,600};
/*      int res = array(array1);
        System.out.println(res);*/

        System.out.println("Summary: " + array(array1) + ", Percent: " + calcPercent(array1) + ", Total: " + calcTotal(array1));
    }
}
