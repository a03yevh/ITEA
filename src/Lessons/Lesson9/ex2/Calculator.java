package Lessons.Lesson9.ex2;

public class Calculator implements SimpleMath, HardMath{

    @Override
    public double sqrt(double a) { return Math.sqrt(a); }

    @Override
    public double pow(double a, double b) {
        return Math.pow(a,b);
    }

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int minus(int a, int b) {
        return a - b;
    }

    @Override
    public int mult(int a, int b) {
        return a * b;
    }

    @Override
    public int div(int a, int b) {
        return a / b;
    }
}