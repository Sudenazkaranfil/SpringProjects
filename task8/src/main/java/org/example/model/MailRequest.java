package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MailRequest {
    private String to;
    private String subject;

    // HTML içeriğe gömülecek alanlar:
    private String title;       // e-postanın üst başlığı
    private String body;        // HTML güvenli gövde (paragraflar vs. olabilir)
    private String actionUrl;   // buton linki (opsiyonel)
}
