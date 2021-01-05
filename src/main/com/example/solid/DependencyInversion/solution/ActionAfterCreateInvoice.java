package main.com.example.solid.DependencyInversion.solution;

import main.com.example.solid.DependencyInversion.utils.Invoice;

public interface ActionAfterCreateInvoice {
    void execute(Invoice invoice);
}