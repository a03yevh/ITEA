package Lessons.Lesson9.ex3;

public class Main {
    public static void main(String[] args) {
        Convertator conv = new ConvertUAHtoEUR();
        System.out.println(conv.convert(500));

        Convertator conv2 = new ConvertUAHtoUSD();
        System.out.println(conv2.convert(500));
    }
}
