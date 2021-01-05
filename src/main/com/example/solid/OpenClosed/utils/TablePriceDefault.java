package main.com.example.solid.OpenClosed.utils;

import main.com.example.solid.OpenClosed.solution.TablePrice;

public class TablePriceDefault implements TablePrice {

    @Override
    public double discountTo(double value) {
        if (value <= 5000) return 0.03;
        if (value <= 10000) return 0.05;
        return 0;
    }
}