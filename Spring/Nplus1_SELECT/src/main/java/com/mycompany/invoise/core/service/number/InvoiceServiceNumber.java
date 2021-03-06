package com.mycompany.invoise.core.service.number;

import com.mycompany.invoise.core.entity.Invoice;

import com.mycompany.invoise.core.repository.InvoiceRepositoryInterface;
import com.mycompany.invoise.core.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class InvoiceServiceNumber implements InvoiceServiceInterface {

    @Autowired
    private InvoiceRepositoryInterface invoiceRepository;

    @Override
    public Iterable<Invoice> getInvoiceList() {
        Iterable<Invoice> invoices= invoiceRepository.findAll();
        //Ceci permet d'initialiser le client de chaque facture
        invoices.forEach(invoice -> invoice.getCustomer().getName());
        return invoices;
    }

    @Override
    public Invoice getInvoiceByNumber(String number) {
        return invoiceRepository.findById(number).orElseThrow();
    }

    public InvoiceRepositoryInterface getInvoiceRepository() {
        return invoiceRepository;
    }

    public void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    public Invoice createInvoice(Invoice invoice){

        return invoiceRepository.save(invoice);
    }
}
