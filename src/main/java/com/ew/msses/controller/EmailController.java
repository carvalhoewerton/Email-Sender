package com.ew.msses.controller;

import com.ew.msses.model.Email;
import com.ew.msses.services.EmailServices;
import jakarta.mail.MessagingException;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/email")
@AllArgsConstructor
public class EmailController {

    @Autowired
    private EmailServices service;
    @PostMapping()
    public void sendEmail(@Valid @RequestBody Email email) throws MessagingException {
            service.sendEmail(email.getFrom(), email.getTo(), email.getSubject(), email.getContent());
    }



}
