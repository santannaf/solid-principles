package main.com.example.solid;

import main.com.example.solid.OpenClosed.problem.CalculatorPrice;
import main.com.example.solid.OpenClosed.solution.CalculatorPriceSolution;
import main.com.example.solid.OpenClosed.solution.FreightDifferentiated;
import main.com.example.solid.OpenClosed.solution.ServiceFreight;
import main.com.example.solid.OpenClosed.solution.TablePrice;
import main.com.example.solid.OpenClosed.utils.Buy;
import main.com.example.solid.OpenClosed.utils.Product;
import main.com.example.solid.OpenClosed.utils.TablePriceDefault;

public class Application {
    public static void main(String[] args) {
        Buy buy = new Buy();
        Product product = new Product("PS5", 4950);
        buy.setCity("RJ");
        buy.setProduct(product);
        CalculatorPrice calculatorPrice = new CalculatorPrice();
        double calculate = calculatorPrice.calculate(buy);
        System.out.println(calculate);

        TablePrice tablePrice = new TablePriceDefault();
        ServiceFreight serviceFreight = new FreightDifferentiated();
        CalculatorPriceSolution calculatorPriceSolution = new CalculatorPriceSolution(tablePrice, serviceFreight);

        double calculate1 = calculatorPriceSolution.calculate(buy);
        System.out.println(calculate1);
    }
}