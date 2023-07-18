package Lessons.Lesson11.L1;

interface Convertor {
    double convertFromUahToUsd(double val);
}

class Europe {
    public static void main(String[] args) {
        Convertor conv = new Convertor() {
            @Override
            public double convertFromUahToUsd(double val) {
                return val*29;
            }
        };
    }
}
public class Main {
    public static void main(String[] args) {
        Convertor conv = new Convertor() {
            @Override
            public double convertFromUahToUsd(double val) {
                return val*39;
            }

        };
    }
}
