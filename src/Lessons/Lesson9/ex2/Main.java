package Lessons.Lesson9.ex2;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.mult(5,3));

        HardMath obj = (HardMath)calc;
        System.out.println(obj.sqrt(144)); //12
        System.out.println(obj.pow(2,4)); //16
    }
}