package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.service.MailService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class TestMailController {

    private final MailService mailService;

    // 1️⃣ Mail gönderme endpoint (FakeSMTP ile yakalanacak)
    @GetMapping("/send-test-mail")
    @ResponseBody
    public String sendTestMail() {
        mailService.sendHtmlMail(
                "test@fake.com",
                "Test Mail Başlığı",
                "Test Başlık",
                "Bu mail test amaçlı gönderilmektedir.",
                "https://example.com"
        );
        return "Mail gönderildi (FakeSMTP ile yakalanacak)";
    }

    // 2️⃣ Mail önizleme endpoint (tarayıcıda gör)
    @GetMapping("/preview-mail")
    public String previewMail(Model model) {
        model.addAttribute("title", "Test Mail Başlığı");
        model.addAttribute("subject", "Test Mail Konusu");
        model.addAttribute("body", "Bu mail test amaçlı gönderilmektedir.");
        model.addAttribute("actionUrl", "https://example.com");

        return "email-template"; // templates/email-template.html
    }
}
