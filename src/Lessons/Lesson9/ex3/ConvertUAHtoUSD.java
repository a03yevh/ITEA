package Lessons.Lesson9.ex3;

public class ConvertUAHtoUSD implements Convertator {
    double kurs = 0.027;
    @Override
    public double convert(double val) {
        return val * kurs;
    }
}
