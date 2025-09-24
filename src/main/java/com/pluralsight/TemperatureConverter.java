package com.pluralsight;

public class TemperatureConverter {
    public static void main(String[] args) {
        double startTempCelsius = 23.7;
        double startTempFahrenheit = 98.6;
        double startTempKelvin = 300.15;
        double fahrenheit;
        double celsius;
        double kelvin;

        System.out.println("Converting " + startTempCelsius + " to Fahrenheit...");
        fahrenheit = ((startTempCelsius * (9.0/5.0)) + 32.0);
        // referenced this to get rounded decimal value - https://stackoverflow.com/questions/11701399/round-up-to-2-decimal-places-in-java
        System.out.println(startTempCelsius + " is: " + Math.round(fahrenheit * 100.0) / 100.0);
        System.out.println();

        System.out.println("Converting " + startTempFahrenheit + " to Celsius...");
        celsius = ((startTempFahrenheit - 32.0) * (5.0/9.0));
        System.out.println(startTempFahrenheit + " is: " + Math.round(celsius * 100.0) / 100.0);
        System.out.println();

    }
}
