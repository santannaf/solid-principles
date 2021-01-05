package main.com.example.solid.DependencyInversion.utils;

public class Invoice {
    private double noteValue;
    private double taxValue;

    public Invoice(double noteValue, double taxValue) {
        this.noteValue = noteValue;
        this.taxValue = taxValue;
    }

    public double getNoteValue() {
        return noteValue;
    }

    public void setNoteValue(double noteValue) {
        this.noteValue = noteValue;
    }

    public double getTaxValue() {
        return taxValue;
    }

    public void setTaxValue(double taxValue) {
        this.taxValue = taxValue;
    }
}