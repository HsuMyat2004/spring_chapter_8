package org.example.spring_chapter_8.crud;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @GetMapping("/products")
    public String findAllProducts(Model model) {
        var products = productService.findAll();
        model.addAttribute("products", products);
        return "products";
    }
    /*
    Your code can use query string parameters, but it doesn’t have to.
    With @RequestParam, Spring will happily bind values from
     either the query string or the form body (for POST requests).
     */

//    @PostMapping("/products")
//    public String addNewProduct(@RequestParam String name,
//                                @RequestParam String price,
//                                Model model){
//        Product p = new Product();
//        p.setName(name);
//        p.setPrice(Double.parseDouble(price));
//        productService.addProduct(p);
//
//        var products = productService.findAll();
//        model.addAttribute("products", products);
//        return "products";
//
//    }

    /*
    @RequestParam → values in query string
    (?name=Book&price=19.99) or form body.

    @PathVariable →
    values embedded in the URI path (/products/Book/19.99).
     */

    @PostMapping("/products")
    public String addNewProduct(Product product,
                                Model model){
        productService.addProduct(product);

//        var products = productService.findAll();
//        model.addAttribute("products", products);
        return "redirect:/products";

    }

    /*
    Thymeleaf doesn’t use Jackson or JSON.
    It uses Spring EL to access JavaBean properties
     */
}
