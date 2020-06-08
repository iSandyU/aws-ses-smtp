package com.sandeepmane.awssesservice.email.controller;

import com.sandeepmane.awssesservice.email.model.Email;
import com.sandeepmane.awssesservice.email.service.EmailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
    
    @Autowired
    EmailService emailService;

    @RequestMapping(path = "/send")
    public String sendEmail(Email email){

        if(emailService.sendEmail(email)){
            return "Email sent Successfully";
        }
        else
        {
            return "Email Failed!!!!!!!!";
        }

        
    }

}