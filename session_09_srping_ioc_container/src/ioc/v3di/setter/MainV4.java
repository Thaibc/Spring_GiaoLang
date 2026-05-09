package com.baobao.spring.ioc.v3di.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainV4 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ContractService contractService = context.getBean(ContractService.class);
        contractService.setPdfGenerator(context.getBean(PdfGenerator.class));
        contractService.generatePdf("filecangenerate");
    }
}
