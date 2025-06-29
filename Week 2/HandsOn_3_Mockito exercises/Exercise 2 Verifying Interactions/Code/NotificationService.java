package com.example.Interactions;

public class NotificationService {
	private EmailSender emailSender;

    public NotificationService(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    public void notifyUser() {
        emailSender.sendEmail("user@example.com");
    }

}
