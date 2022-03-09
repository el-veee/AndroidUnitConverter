package com.lachlanvass.unitconverter;

public class TemperatureConverter {

    public Double Celcius;
    public Double Fahrenheit;
    public Double Kelvin;

    public TemperatureConverter(Double celciusValue) {

        this.Celcius = celciusValue;
        this.Fahrenheit = convertCelciusToFahrenheit();
        this.Kelvin = convertCelciusToKelvin();

    }

    private Double convertCelciusToFahrenheit() {
        // (1°C × 9/5) + 32
        return (this.Celcius * 9/5) + 32;
    }

    private Double convertCelciusToKelvin() {
        return this.Celcius + 273.15;
    }

}
