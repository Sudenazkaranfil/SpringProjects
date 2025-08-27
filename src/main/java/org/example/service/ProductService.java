package org.example.service;

import org.example.model.Product;
import org.example.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;
    private static final int LOW_STOCK_THRESHOLD = 5; // stok uyarı limiti

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public void checkStock() {
        List<Product> products = productRepository.findAll();
        for (Product product : products) {
            if (product.getStock() <= LOW_STOCK_THRESHOLD) {
                System.out.println("UYARI: '" + product.getName() + "' ürünü düşük stokta! (Stok: " + product.getStock() + ")");
            }
        }
    }
}
