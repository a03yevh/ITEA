package Lessons.Lesson9.ex3;

public class ConvertUAHtoEUR implements Convertator {
    double kurs = 0.025;
    @Override
    public double convert(double val) {
        return val * kurs;
    }
}
