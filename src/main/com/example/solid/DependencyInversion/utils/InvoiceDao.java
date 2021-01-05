package main.com.example.solid.DependencyInversion.utils;

import main.com.example.solid.DependencyInversion.solution.ActionAfterCreateInvoice;

public class InvoiceDao implements ActionAfterCreateInvoice {

    public void save(Invoice invoice) {
        // SAVE INVOICE
    }

    @Override
    public void execute(Invoice invoice) {
        // SAVE INVOICE
    }
}
