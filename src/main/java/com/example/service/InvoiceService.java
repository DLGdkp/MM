package com.example.service;

import com.example.domain.Invoice;
import com.example.domain.Venue;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

@Service
public class InvoiceService {


    public Object generateInvoice(Invoice i) throws DocumentException, FileNotFoundException {
        Document document = new Document();


        PdfWriter.getInstance(document, new FileOutputStream("iTextHelloWorld.pdf"));

        document.open();
        Font font = FontFactory.getFont(FontFactory.COURIER, 16, BaseColor.BLACK);
        Chunk chunk = new Chunk("Hello World", font);

        document.add(getClientChunk(i.getVenue()));
        document.add(getClientChunk(i.getVenue()));

        document.close();
        return document;
    }

    private Chunk getClientChunk(Venue v){
        Font font = FontFactory.getFont(FontFactory.COURIER, 16, BaseColor.BLACK);
        String name = v.getCompany().getCompanyName();
        int kvk = v.getCompany().getKVK();
        String btw = v.getCompany().getBTW();
        String contact = v.getRepresentatives().get(0).toString();
        String bedrijfsgegevens = String.format("Klant: %s \nKVK-nummer: %d \nBTW-nummer: %s \nContactpersoon: %s \n\nAdres:\n",name,kvk,btw,contact);
        String straat = v.getCompany().getAddress().getStreet();


        return new Chunk(bedrijfsgegevens, font);

    }

}
