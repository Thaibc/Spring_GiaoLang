package com.baobao.spring.ioc.v2bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

//@ComponentScan ("package1") nếu mà ta khai báo annitation này thì thư viện spring context sẽ vào package1 quét tất cả class có 3 @ hồi nãy thì nó sẽ lấy tên class làm tên bean rồi quản lý bean đó

public class AppConfig {

    //còn nếu ko mún tên bean đc đặt tự động theo tên class thì phải tự new ở đây
    @Bean(name = "ngocTrinh") //object dc return từ hàm này đi vào container ngay
    public PdfGenerator pdfGenerator() {
        return new PdfGenerator();
    }



}
