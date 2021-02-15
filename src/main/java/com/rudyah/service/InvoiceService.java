package com.rudyah.service;

import com.rudyah.bean.Invoice;

public class InvoiceService {

    public Invoice create(String userId, Integer amount) {
        // TODO real pdf creation and storing it on network server
        return new Invoice(userId, amount, "http://www.africau.edu/images/default/sample.pdf");
    }

}