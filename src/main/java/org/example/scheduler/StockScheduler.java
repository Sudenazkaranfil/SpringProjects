package org.example.scheduler;

import org.example.service.ProductService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class StockScheduler {

    private final ProductService productService;

    public StockScheduler(ProductService productService) {
        this.productService = productService;
    }

    // Her 10 saniyede bir çalışacak örnek cron
    @Scheduled(fixedRate = 10000)
    public void checkStockPeriodically() {
        System.out.println("=== Stok kontrol görevi çalışıyor ===");
        productService.checkStock();
    }
}
