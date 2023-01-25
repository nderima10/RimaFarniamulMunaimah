package Chapter6_Methods.Exercise;

public class Soal8_ConversiBetweenCelciusAnFahrenheit {
    public static void main(String[] args) {
        System.out.println(
                "Celsius    Fahrenhaeit     |   Fahhrenheit     Celcius\n" +
                "--------------------------------------------------------");
        for (double celcius = 40.0, fahrenheit = 120.0; celcius >= 31.0; celcius--, fahrenheit -= 10) {
                System.out.printf("%-12.1f", celcius);
                System.out.printf("%-15.2f", celciusTofahrenheit(celcius));
                System.out.print(" | ");
                System.out.printf("     %-15.1f", fahrenheit);
                System.out.printf("%-7.2f\n\n", fahrenheitToCelcius(fahrenheit));
        }
    }
    public static double celciusTofahrenheit(double celcius) {
        return (9.0 / 5) * celcius + 32;
    }
    public static double fahrenheitToCelcius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }
}
