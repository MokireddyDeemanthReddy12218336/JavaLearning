package com.mphasis.firstspringapp.service;

public class EmailService {
	private EmailConfig emailConfig;

	public EmailConfig getEmailConfig() {
		return emailConfig;
	}

	public void setEmailConfig(EmailConfig emailConfig) {
		this.emailConfig = emailConfig;
	}
	public void sendEmail() {
		System.out.println("Email is sent...");
	}
	
	
}
