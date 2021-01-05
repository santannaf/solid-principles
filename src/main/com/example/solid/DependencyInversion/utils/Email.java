package main.com.example.solid.DependencyInversion.utils;

import main.com.example.solid.DependencyInversion.solution.ActionAfterCreateInvoice;

public class Email implements ActionAfterCreateInvoice {

    public void send(Invoice invoice) {
        // SEND EMAIL
    }

    @Override
    public void execute(Invoice invoice) {
        // SEND EMAIL
    }
}