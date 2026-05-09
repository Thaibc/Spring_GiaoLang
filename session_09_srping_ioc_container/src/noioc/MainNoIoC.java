package com.baobao.spring.noioc;

public class MainNoIoC {
   //cai noi ma se new ra cac dependency roi chich vao class can su dung thi goi la IoC container
   //nay la IoC handMade xiu su dung framework Spring de no bao cho minh
   public static void main(String[] args) {
       PdfGenerator pdfGenerator = new PdfGenerator();

        // tiem pdfGenerator vo thong qua constructor
       ContractService contractService=new ContractService(pdfGenerator);
       contractService.processContract();
   }
}
