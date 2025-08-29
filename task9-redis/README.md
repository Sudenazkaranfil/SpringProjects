# Task 9 - Redis Entegrasyonu ile Spring Boot Cache Uygulaması

Bu proje, Spring Boot kullanarak basit bir ürün servisi ve Redis entegrasyonlu cache mekanizmasını göstermektedir.

## Proje Özellikleri

- Spring Boot 3.2.0 ve Java 21 kullanılmıştır.
- Redis ile cache mekanizması entegre edilmiştir.
- Basit bir `ProductService` ile ürün bilgileri sağlanmaktadır.
- `@Cacheable` anotasyonu ile Redis cache kullanılmaktadır.
- Caffeine cache de opsiyonel olarak desteklenmektedir (önceki sürüm).

## Kullanılan Teknolojiler

- Spring Boot
- Spring Cache
- Spring Data Redis
- Redis
- Maven

## Redis Çalıştırma

Redis’in sisteminde çalışıyor olması gerekir. Örnek Docker komutu:

```bash
docker run --name redis -p 6379:6379 -d redis
```
application.properties içinde default Redis host ve port (localhost:6379) kullanılmaktadır.

## Notlar

Cache TTL: 5 dakika

Maksimum cache boyutu: 100 ürün

##Proje Çıktısı

<img width="530" height="110" alt="task9-redis" src="https://github.com/user-attachments/assets/2ab5cb29-a239-4e3c-8fe3-2f2fde173f1c" />
