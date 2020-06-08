package com.sandeepmane.awssesservice.email.service;

import com.sandeepmane.awssesservice.email.model.Email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    
    @Autowired
    JavaMailSender mailSender;

    public boolean sendEmail(Email email)
    {

        SimpleMailMessage eMailMessage = new SimpleMailMessage();
        eMailMessage.setTo(email.getToEmail());
        eMailMessage.setFrom(email.getFromEmail());
        eMailMessage.setReplyTo(email.getReplyTo());
        eMailMessage.setSubject(email.getSubject());
        eMailMessage.setText(email.getEmailBody());
        try {
            System.out.println("Before sending email: "+email);
            mailSender.send(eMailMessage);
        } catch (Exception e) {
            //catch exception
            e.printStackTrace();
            System.out.println("Exception occurred: "+e.toString());
            return false;
        }
        
        return true;
    }

}