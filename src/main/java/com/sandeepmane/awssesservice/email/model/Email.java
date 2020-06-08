package com.sandeepmane.awssesservice.email.model;

import org.springframework.beans.factory.annotation.Value;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Email {
    
    @NonNull
    private String toEmail;

    @NonNull
    private String fromEmail;

    private String subject;

    private String emailBody;

    @Value("${reply-to}")
    private String replyTo;

}