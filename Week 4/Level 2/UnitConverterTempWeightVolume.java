import java.util.*;

public class UnitConverterTempWeightVolume {
    public static double convertFarhenheitToCelsius(double farhenheit) {
        return (farhenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFarhenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double fahrenheit = sc.nextDouble();
        System.out.println("Fahrenheit to Celsius: " + convertFarhenheitToCelsius(fahrenheit));

        double celsius = sc.nextDouble();
        System.out.println("Celsius to Fahrenheit: " + convertCelsiusToFarhenheit(celsius));

        double pounds = sc.nextDouble();
        System.out.println("Pounds to Kilograms: " + convertPoundsToKilograms(pounds));

        double kilograms = sc.nextDouble();
        System.out.println("Kilograms to Pounds: " + convertKilogramsToPounds(kilograms));

        double gallons = sc.nextDouble();
        System.out.println("Gallons to Liters: " + convertGallonsToLiters(gallons));

        double liters = sc.nextDouble();
        System.out.println("Liters to Gallons: " + convertLitersToGallons(liters));
    }
}
