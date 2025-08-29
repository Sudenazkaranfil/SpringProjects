package org.example.controller;

import org.example.service.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cache")
public class CacheController {

    private final ProductService productService;

    public CacheController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/product/{id}")
    public String getProduct(@PathVariable Integer id) {
        return productService.getProductById(id);
    }
}
