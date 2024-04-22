package com.example.demo.controllers;

import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BuyController {
    @Autowired
    private ProductService productService;


    @PostMapping("/buyProduct")
    public String buyProduct(@RequestParam("productId") int productId) {
        boolean success = productService.decrementProductInventory(productId);
        if (success) {
            return "confirmation"; // Redirect to confirmation page
        } else {
            return "failure"; // Redirect to error page
        }
    }
}
