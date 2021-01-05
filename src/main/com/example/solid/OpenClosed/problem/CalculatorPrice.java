package main.com.example.solid.OpenClosed.problem;

import main.com.example.solid.OpenClosed.utils.Buy;
import main.com.example.solid.OpenClosed.utils.FreightDefault;
import main.com.example.solid.OpenClosed.utils.TablePriceDefault;

public class CalculatorPrice {

    public double calculate(Buy buy) {
        TablePriceDefault tablePriceDefault = new TablePriceDefault();
        FreightDefault freightDefault = new FreightDefault();

        double discount = tablePriceDefault.discountTo(buy.getProduct().getPrice());
        double freightValue = freightDefault.calculateTo(buy.getCity());

        return buy.getProduct().getPrice() * (1 - discount) + freightValue;
    }
}