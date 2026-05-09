package com.baobao.spring.ioc.v3di.setter;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component

public class PdfGenerator {

    public void generatePdf(String fileName) {
        //TODO: logic xu ly generate ra pdf
        System.out.println(" V4 The pdf file " + fileName + " da duoc xuat thanh cong!!");
    }
}
