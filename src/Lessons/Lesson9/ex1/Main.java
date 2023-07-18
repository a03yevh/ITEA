package Lessons.Lesson9.ex1;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.adding(5,7);

        Interface3 onlyMult = (Interface3)calc;
        System.out.println(onlyMult.mult(4,8));
    }
}