package com.baobao.spring.ioc.v3di.constructor;

import org.springframework.stereotype.Repository;

@Repository
public class PdfGenerator {
    public void generatePdf(String fileName) {
        //TODO: logic xu ly generate ra pdf
        System.out.println(" V3 The pdf file " + fileName + " da duoc xuat thanh cong!!");
    }
}
