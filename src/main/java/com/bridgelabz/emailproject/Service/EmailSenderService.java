package com.bridgelabz.emailproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService {
    @Autowired
    private JavaMailSender javaMailSender;

    public void sendSimpleEmail(String toEmail,
                                String subject,
                                String body)
    {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("meghajagadale99@gmail.com");
        message.setTo(toEmail);
        message.setText(body);
        message.setSubject(subject);
        javaMailSender.send(message);
        System.out.println("Mail Send Successfully...");
    }

}

