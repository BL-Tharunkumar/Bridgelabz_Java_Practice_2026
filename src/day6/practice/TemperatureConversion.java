package day6.practice;

public class TemperatureConversion {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {

        double c = 25;
        double f = 77;

        System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(c));
        System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(f));
    }
}
