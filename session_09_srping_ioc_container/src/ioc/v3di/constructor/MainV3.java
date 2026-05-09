package com.baobao.spring.ioc.v3di.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainV3 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // luc nay e co 2 Bean nhen
        ContractService contractService = context.getBean(ContractService.class);
        contractService.processContract("filecangenerate");

    }
}
