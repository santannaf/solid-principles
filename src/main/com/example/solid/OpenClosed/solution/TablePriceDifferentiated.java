package main.com.example.solid.OpenClosed.solution;

public class TablePriceDifferentiated implements TablePrice {

    @Override
    public double discountTo(double value) {
        if (value > 100000) return 0.20;
        return 0;
    }
}