package Homeworks.HW_Lesson7_sp.HW4;

public class ConverterTemperature implements CelsiusToFahrenheitConverter, CelsiusToKelvinConverter {
    public double convertToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public double convertToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static void main(String[] args) {
        ConverterTemperature converter = new ConverterTemperature();
        double celsius = 25;

        double fahrenheit = converter.convertToFahrenheit(celsius);
        double kelvin = converter.convertToKelvin(celsius);

        System.out.println(celsius + " degrees Celsius = " + fahrenheit + " degrees Fahrenheit ");
        System.out.println(celsius + " degrees Celsius = " + kelvin + " degrees Kelvin ");
    }
}