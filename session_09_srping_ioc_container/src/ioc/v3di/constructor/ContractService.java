package com.baobao.spring.ioc.v3di.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // no la @Component do nhung ma class nay thuoc tang service nen dat la @Service

public class ContractService {
    // toi xu ly hop dong la viec chinh
    //va toi can xu dung dependency tu ben ngoai
    private PdfGenerator pdfGenerator; //new la tao dam

    //constructor rong
    public ContractService() {
    }

    //tiem vao cho tao
    @Autowired //chich vao, tiem vao 1 Bean khac ## NEU CO TU 2 constructor TRO LEN THI CAN SU DUNG @Autowired
    public ContractService(PdfGenerator pdfGenerator) {
        this.pdfGenerator = pdfGenerator;
    }

    //xai dependency  dc chich vao
    public void processContract(String fileName) {
        pdfGenerator.generatePdf(fileName);
    }
}
