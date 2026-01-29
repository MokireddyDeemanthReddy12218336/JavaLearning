package com.mphasis.secondspringapp.service;


public class EmailService {
	
	private EmailConfig emailconfig;
	
	public EmailConfig getEmailconfig() {
		return emailconfig;
	}
	
	public void setEmailconfig(EmailConfig emailconfig) {
		this.emailconfig = emailconfig;
	}

	public void sendMail() {
		System.out.println("Mail sent....using.."+ emailconfig.getIp() +","+emailconfig.getToken());
	}
}
