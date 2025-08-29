package org.example.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ProductService {

    private Map<Integer, String> database = Map.of(
            1, "Laptop",
            2, "Telefon",
            3, "Tablet",
            4, "Kulaklık",
            5, "Monitör"
    );

    @Cacheable("products")
    public String getProductById(Integer id) {
        System.out.println("Database çağrısı yapılıyor: " + id);
        return database.get(id);
    }
}
