package com.pluralsight;

import com.sun.security.jgss.GSSUtil;

public class TemperatureConverter {
    public static void main(String[] args) {
        double startTempCelsius = 23.7;
        double startTempFahrenheit = 98.6;
        double startTempKelvin = 300.15;
        double fahrenheit;
        double celsius;
        double kelvin;

        System.out.println("Converting " + startTempCelsius + " degrees Celsius to Fahrenheit...");
        fahrenheit = ((startTempCelsius * (9.0/5.0)) + 32.0);
        // referenced this to get rounded decimal value - https://stackoverflow.com/questions/11701399/round-up-to-2-decimal-places-in-java
        System.out.println(startTempCelsius + " degrees Celsius is: " + Math.round(fahrenheit) + " degrees Fahrenheit.");
        System.out.println("Precise temperatures: " + (Math.round(fahrenheit * 10.0) / 10.0) + " degrees and " + (Math.round(fahrenheit * 100.0) / 100.0) + " degrees.");
        System.out.println();

        System.out.println("Converting " + startTempFahrenheit + " degrees Fahrenheit to Celsius...");
        celsius = ((startTempFahrenheit - 32.0) * (5.0/9.0));
        System.out.println(startTempFahrenheit + " degrees Fahrenheit is: " + Math.round(celsius) + " degrees Celsius.");
        System.out.println("Precise temperatures: " + (Math.round(celsius * 10.0) / 10.0) + " degrees and " + (Math.round(celsius * 100.0) / 100.0) + " degrees.");
        System.out.println();

        System.out.println("Converting " + startTempCelsius + " degrees Celsius to Kelvin...");
        kelvin = startTempCelsius + 273.15;
        System.out.println(startTempCelsius + " degrees Celsius is: " + Math.round(kelvin) + " degrees Kelvin.");
        System.out.println("Precise temperatures: " + (Math.round(kelvin * 10.0) / 10.0) + " degrees and " + (Math.round(kelvin * 100.0) / 100.0) + " degrees.");
        System.out.println();

        System.out.println("Converting " + startTempKelvin + " degrees Kelvin to Celsius...");
        celsius = startTempKelvin - 273.15;
        System.out.println(startTempKelvin + " degrees Kelvin is: " + Math.round(celsius) + " degrees Celsius.");
        System.out.println("Precise temperatures: " + (Math.round(celsius * 10.0) / 10.0) + " degrees and " + (Math.round(celsius * 100.0) / 100.0) + " degrees.");
        System.out.println();

    }
}
