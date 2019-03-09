package com.tmfdk333.inflearn.chap1.view;

public class ViewDefinition {
    public void viewDefinition() {
        EmailSender emailSender = new EmailSender(1L, "tmfdk333", "tmfdk333@gmail.com");
        emailSender.send("test@gmail.com");
    }
}
