package com.ffeiko.email;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message.RecipientType;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailSendUtil {

	private String account;

	private String password;

	private String smtpHost;

	private String smtpPort;

	private boolean ssl;

	public EmailSendUtil(String account, String password, String smtpHost, String smtpPort) {
		this(account, password, smtpHost, smtpPort, true);
	}

	public EmailSendUtil(String account, String password, String smtpHost, String smtpPort, boolean ssl) {
		super();
		this.account = account;
		this.password = password;
		this.smtpHost = smtpHost;
		this.smtpPort = smtpPort;
		this.ssl = ssl;
	}

	public boolean send(String to, String subject, String body) {
		return send(to, subject, body, false);
	}

	public boolean send(String to, String subject, String body, boolean html) {
		return send(Arrays.asList(to), subject, body, html);
	}

	public boolean send(List<String> toList, String subject, String body) {
		return send(toList, subject, body, false);
	}

	public boolean send(List<String> toList, String subject, String body, boolean html) {
		Properties props = new Properties();
		props.setProperty("mail.transport.protocol", "smtp");
		props.setProperty("mail.smtp.host", smtpHost);
		props.setProperty("mail.smtp.port", smtpPort);
		props.setProperty("mail.smtp.auth", "true");
		if (ssl) {
			props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
			props.setProperty("mail.smtp.socketFactory.fallback", "false");
		}
		Session session = Session.getDefaultInstance(props, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(account, password);
			}
		});
		MimeMessage message = new MimeMessage(session);
		try {
			message.setFrom(new InternetAddress(account));
			message.setSubject(subject);
			for (String to : toList) {
				message.addRecipient(RecipientType.TO, new InternetAddress(to));
			}
			message.setSentDate(new Date());
			message.setText(body, "UTF-8", html ? "html" : "plain");
			message.saveChanges();
			Transport.send(message);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return true;
	}
	
	public static void main(String args[]){
		EmailSendUtil emailUtil = new EmailSendUtil("2593851856@qq.com", "hxmqnbadoyemdiah", "smtp.qq.com", "465");
		emailUtil.send("wangjingffei@126.com", "whoami email test", "tetsdfsfdffsfdsf");
	}
}
