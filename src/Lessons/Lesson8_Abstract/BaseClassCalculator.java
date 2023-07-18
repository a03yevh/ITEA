package Lessons.Lesson8_Abstract;

public abstract class BaseClassCalculator {
    public abstract double plus(double op1, double op2);
    public abstract double minus(double op1, double op2);
    public abstract double mult(double op1, double op2);
    public abstract double div(double op1, double op2);
}

class Calculator extends BaseClassCalculator {

    @Override
    public double plus(double op1, double op2) {
        return op1 + op2;
    }

    @Override
    public double minus(double op1, double op2) {
        return op1 - op2;
    }

    @Override
    public double mult(double op1, double op2) {
        return op1 * op2;
    }

    @Override
    public double div(double op1, double op2) {
        return op1 / op2;
    }
}

class Main {
    public static void main(String[] args) {
        BaseClassCalculator calc = new Calculator();
        System.out.println(calc.mult(5,5));
    }
}