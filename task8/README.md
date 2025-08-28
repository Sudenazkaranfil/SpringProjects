# Java Spring Boot – Mail Gönderim Servisi (FakeSMTP)

## 📌 Proje Hakkında
Bu proje, **Spring Boot** ve **JavaMailSender** kullanarak e-posta gönderimi yapmak için hazırlanmıştır.  
Gerçek e-posta göndermek yerine, test amaçlı **FakeSMTP** ile mail gönderimi sağlanmaktadır.  

<img width="517" height="94" alt="local" src="https://github.com/user-attachments/assets/44c6b2c5-ffb0-405e-8e87-c8936d8c5c13" />

### Amaç
- Mail gönderim mantığını öğrenmek.  
- Spring Boot uygulamasından e-posta gönderimini test etmek.  
- Test ortamında mail içeriğini görüntülemek.

---

## 🛠 Kullanılan Teknolojiler
- **Java 21**
- **Spring Boot 3.1.2**
- **Spring Boot Starter Mail**
- **Spring Web**
- **Lombok**
- **Maven**
- **FakeSMTP** (lokalde mail test aracı)

---

## 🛠 Kurulum

1. Projeyi klonlayın:
```bash
git clone https://github.com/sudenazkaranfil/mail-demo.git
```
Maven bağımlılıklarını yükleyin:
```bash
mvn clean install
```
Uygulamayı çalıştırın:
```bash
mvn spring-boot:run
```
FakeSMTP’i başlatın:

FakeSMTP’i indirip çalıştırın.

Port: 1025 (JavaMailSender ile aynı olmalı)

## 📡 Endpoint Bilgileri
### Test Mail Gönderimi

URL: http://localhost:8080/mail/send

Method: POST

Response: "Mail gönderildi ✅"

Mail İçeriği Örneği
```bash
From: suden@DESKTOP-7NH88GH
To: test@fake.com
Subject: Test Mail Başlığı

Mail içeriği buraya gelecek
İşlemi Tamamla
Bu e-posta otomatik gönderilmiştir. Lütfen yanıtlamayın.
```
<img width="1653" height="823" alt="mailhog" src="https://github.com/user-attachments/assets/1314aaad-20a5-4c1e-bb05-1f229920efcf" />
