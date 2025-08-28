package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.service.MailService;
import org.example.model.MailRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MailController {

    private final MailService mailService;

    @PostMapping("/send-mail")
    public String sendMail(@RequestBody MailRequest mailRequest) {
        mailService.sendMail(mailRequest.getTo(), mailRequest.getSubject(), mailRequest.getBody());
        return "Mail gönderildi!";
    }
}
