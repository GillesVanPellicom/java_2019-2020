package com.powkiemawn;

public class Aanval {
    private String naam = "Not defined";
    private int power = 0;
    private int precision = 0;
    private String description = "Not defined";

    public Aanval(String naam, int power, int precision, String description) {
        this.setNaam(naam);
        this.setPower(power);
        this.setPrecision(precision);
        this.setDescription(description);
    }

    public static void main(String[] args) {

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        if (power < 0 || power > 150) {
            throw new IllegalArgumentException("Power range is [0;150]");
        } else {
            this.power = power;
        }
    }

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        if (precision < 0 || precision > 100) {
            throw new IllegalArgumentException("Precision range is [0;100]");
        } else {
            this.precision = precision;
        }
    }
}
