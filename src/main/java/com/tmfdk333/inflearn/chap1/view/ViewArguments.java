package com.tmfdk333.inflearn.chap1.view;

public class ViewArguments {
    public void viewArguments() {
        EmailSender emailSender = new EmailSender(1L, "tmfdk333", "tmfdk333@gmail.com");
        EmailSender.receive("tmfdk333@gmail.com", "test@gmail.com");
    }
}
