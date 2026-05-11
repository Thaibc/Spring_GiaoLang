package coffeev2.controller.web;


import coffeev2.entity.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller //lang nghe request tra ve HTML
//1 URL get ung voi 1 Method va return trang nao do
public class ProductController {


    @GetMapping("/products") //ung voi url nao

    public String getProductList(Model model) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("CF1", "Ca Phe Trung Nguyen", 100000));
        productList.add(new Product("TS01", "Tra Sua Truyen Thong", 20000));
        model.addAttribute("productList", productList);
        return "products";
    }


}
