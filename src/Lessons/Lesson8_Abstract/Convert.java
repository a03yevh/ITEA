package Lessons.Lesson8_Abstract;

public abstract class Convert {
    public abstract double convertUAHtoUS(double uah, double usd);
    public abstract double convertUAHtoEUR(double uah, double eur);
}

class ConvertNew extends Convert{
    @Override
    public double convertUAHtoUS(double uah, double usd) {
        return uah * usd;
    }

    @Override
    public double convertUAHtoEUR(double uah, double eur) {
        return uah * eur;
    }
}

class Main1 {
    public static void main(String[] args) {
        Convert obj = new ConvertNew();
        System.out.println(obj.convertUAHtoEUR(50,100));
    }
}