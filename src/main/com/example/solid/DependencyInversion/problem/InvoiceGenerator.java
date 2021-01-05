package main.com.example.solid.DependencyInversion.problem;

import main.com.example.solid.DependencyInversion.utils.Bill;
import main.com.example.solid.DependencyInversion.utils.Email;
import main.com.example.solid.DependencyInversion.utils.Invoice;
import main.com.example.solid.DependencyInversion.utils.InvoiceDao;

public class InvoiceGenerator {
    private final Email email;
    private final InvoiceDao dao;

    public InvoiceGenerator(Email email, InvoiceDao invoiceDao) {
        this.email = email;
        this.dao = invoiceDao;
    }

    // BILL IT'S SAME "FATURA" IN PORTUGUESE
    public Invoice create(Bill bill) {
        double value = bill.getMonthValue();
        Invoice invoice = new Invoice(value, sampleTaxInto(value));
        this.email.send(invoice);
        this.dao.save(invoice);
        return invoice;
    }

    private double sampleTaxInto(double value) {
        return value * 0.06;
    }
}