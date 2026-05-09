package com.baobao.spring.ioc.v3di.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service


public class ContractService {
    private PdfGenerator gen;

    // constructor rong
    public ContractService() {
    }

    //dung setter de chich vo

    public void setPdfGenerator(PdfGenerator gen) {
        this.gen = gen;
    }

    public void generatePdf(String fileName) {
        gen.generatePdf(fileName);
    }


}
