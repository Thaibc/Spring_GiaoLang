package com.baobao.spring.noioc;

public class ContractService {
    //doi voi hop dong thi minh can generate ra PDF thi can phai phu thuoc vao PdfGenerate class thi luc nay  PdfGenerator phai la dependency cua class nay
    private PdfGenerator pdfGenerator; //neu ma new o day lun se bi tight coupling

    public ContractService(PdfGenerator pdfGenerator) {
        this.pdfGenerator = pdfGenerator;
//        day la constructor DI chich thong qua constructor
    }

    public void processContract(){
        //TODO logic xu ly hop dong....
        // generate Pdf file
        pdfGenerator.generatePdf("filecangenarate");
    }


//    chich thong qua setter TODO

}
