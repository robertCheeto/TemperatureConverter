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
        fahrenheit = (startTempCelsius * (9/5)) + 32;
        System.out.println(startTempCelsius + " is: " + Math.round(fahrenheit * 100.0) / 100.0);

    }
}
