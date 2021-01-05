package main.com.example.solid.DependencyInversion.solution;

import main.com.example.solid.DependencyInversion.utils.Bill;
import main.com.example.solid.DependencyInversion.utils.Invoice;

import java.util.List;

public class InvoiceGeneratorSolution {
    private final List<ActionAfterCreateInvoice> actions;

    public InvoiceGeneratorSolution(List<ActionAfterCreateInvoice> actions) {
        this.actions = actions;
    }

    public Invoice create(Bill bill) {
        double value = bill.getMonthValue();
        Invoice invoice = new Invoice(value, sampleTaxInto(value));

        for (ActionAfterCreateInvoice action : this.actions) {
            action.execute(invoice);
        }
        return invoice;
    }

    private double sampleTaxInto(double value) {
        return value * 0.06;
    }
}