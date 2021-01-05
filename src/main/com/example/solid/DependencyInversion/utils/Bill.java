package main.com.example.solid.DependencyInversion.utils;

public class Bill {
    private double monthValue;

    public Bill(double monthValue) {
        this.monthValue = monthValue;
    }

    public Bill() {
    }

    public double getMonthValue() {
        return monthValue;
    }

    public void setMonthValue(double monthValue) {
        this.monthValue = monthValue;
    }
}