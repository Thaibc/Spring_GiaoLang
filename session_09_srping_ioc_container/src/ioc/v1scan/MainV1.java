package com.baobao.spring.ioc.v1scan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainV1 {
    public static void main(String[] args) {
        //khoi tao thung chua object IoC container
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        // roi bay gio thi context nay la container roi do nhe quan li cac bean, quan ly luon viec tiem va cac object khac
        //NHUNG ma mun dc tiem vao thi object do phai la bean lun vi t chi quan ly dc bean thoi.
        //Trum cuoi nay giong nhu Entity-Manager factory
        PdfGenerator pdfGenerator = context.getBean(PdfGenerator.class);
        pdfGenerator.generatePdf("filecangenerate");

    }
}
