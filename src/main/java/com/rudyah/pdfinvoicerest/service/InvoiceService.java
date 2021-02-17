package com.rudyah.pdfinvoicerest.service;

import com.rudyah.pdfinvoicerest.bean.Invoice;
import com.rudyah.pdfinvoicerest.bean.User;
import com.rudyah.pdfinvoicerest.context.Application;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InvoiceService {

    private List<Invoice> invoices = new CopyOnWriteArrayList<>();

    public List<Invoice> findAll(){
        return invoices;
    }

    public Invoice create(String userId, Integer amount) {
        User user = Application.userService.findById(userId);
        if (user == null) {
            throw new IllegalStateException();
        }
        Invoice invoice = new Invoice(userId, amount, "http://www.africau.edu/images/default/sample.pdf");
        invoices.add(invoice);
        return invoice;
    }

}