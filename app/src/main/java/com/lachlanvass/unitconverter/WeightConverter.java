package com.lachlanvass.unitconverter;

public class WeightConverter {

    public Double Kilograms;
    public Double Grams;
    public Double Ounce;
    public Double Pound;

    public WeightConverter(Double kilogramValue) {

        this.Kilograms = kilogramValue;
        this.Grams = convertkgToGrams();
        this.Ounce = convertkgToOunce();
        this.Pound = convertkgToPound ();

    }

    private Double convertkgToGrams() {
        return this.Kilograms * 1000;
    }

    private Double convertkgToOunce() {
        return this.Kilograms * 35.274;
    }

    private Double convertkgToPound() {
        return this.Kilograms * 2.205;
    }
}
