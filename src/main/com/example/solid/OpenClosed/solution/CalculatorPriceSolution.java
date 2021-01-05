package main.com.example.solid.OpenClosed.solution;

import main.com.example.solid.OpenClosed.utils.Buy;

@SuppressWarnings("unused")
public class CalculatorPriceSolution {
    private final TablePrice tablePrice;
    private final ServiceFreight serviceFreight;

    public CalculatorPriceSolution(TablePrice tablePrice, ServiceFreight serviceFreight) {
        this.tablePrice = tablePrice;
        this.serviceFreight = serviceFreight;
    }

    public double calculate(Buy buy) {
        double discount = this.tablePrice.discountTo(buy.getProduct().getPrice());
        double freightValue = this.serviceFreight.freightTo(buy.getCity());

        return buy.getProduct().getPrice() * (1 - discount) + freightValue;
    }
}