package com.rudyah.pdfinvoicerest.context;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rudyah.pdfinvoicerest.service.InvoiceService;

public class Application {

    public static final InvoiceService invoiceService = new InvoiceService();
    public static final ObjectMapper objectMapper = new ObjectMapper();

}