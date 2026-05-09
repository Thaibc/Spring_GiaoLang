package com.baobao.spring.ioc.v1scan;

import org.springframework.stereotype.Component;

@Component // nghĩa là đây là 1 Bean sẽ đc quản lý bởi Spring, TỰ ĐỘNG lưu bởi thư viện Sping context
//@Service hay @Reposistory đều đc nhưng 2 th này là con của @Component

public class PdfGenerator {
    //
    public void generatePdf(String fileName) {
        //TODO: logic xu ly generate ra pdf
        System.out.println(" V1 The pdf file " + fileName + " da duoc xuat thanh cong!!");
    }
}
