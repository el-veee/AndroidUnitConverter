package com.lachlanvass.unitconverter;

public class MetreConverter {

    public Double Metres;
    public Double Centimetre;
    public Double Foot;
    public Double Inch;

    public MetreConverter(Double metreValue) {

        this.Metres = metreValue;
        this.Centimetre = convertMetreToCentimetre();
        this.Foot = convertMetreToFoot();
        this.Inch = convertMetreToInch();

    }

    private Double convertMetreToCentimetre() {
        return this.Metres * 100;
    }

    private Double convertMetreToFoot() {
        return this.Metres * 3.281;
    }

    private Double convertMetreToInch() {
        return this.Metres * 39.37;
    }
}
