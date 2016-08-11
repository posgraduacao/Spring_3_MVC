package br.up.pos.spring.service.impl;

import java.io.IOException;
import java.util.Map;

import javax.inject.Inject;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.hibernate.service.spi.ServiceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import br.up.pos.spring.freemarker.template.TemplateLoader;
import br.up.pos.spring.service.EmailService;


/**
 * Implementação padrão do serviço de envio de email.
 * 
 */
@Service("emailService")
public class EmailServiceImpl implements EmailService {

	/**
	 * Responsável pela apresentação do log na aplicação.
	 */
	private static final Logger LOGGER = LoggerFactory
			.getLogger(EmailServiceImpl.class);

	/**
	 * @see JavaMailSender
	 */
	@Inject
	private JavaMailSender mailSender;

	@Inject
	private TemplateLoader templateLoader;

	@Override
	public void send(final String to, final String from, final String subject,
			final String text) throws Exception {
		send(new String[] { to }, from, subject, text);
	}

	@Async
	@Override
	public void sendAsync(String to, String from, String subject, String text)
			throws Exception {
		send(to, from, subject, text);
	}

	public void setMailSender(JavaMailSender mailSender) {
		this.mailSender = mailSender;
	}

	public JavaMailSender getMailSender() {
		return mailSender;
	}

	@Override
	public void send(String[] to, String from, String subject, String text)
			throws Exception {

		MimeMessage message = mailSender.createMimeMessage();

		try {
			MimeMessageHelper helper = new MimeMessageHelper(message, true);
			helper.setTo(to);

			if (from != null) {
				helper.setFrom(from);
			}

			helper.setSubject(subject);
			helper.setText(text, true);
		} catch (MessagingException e) {
			LOGGER.error("Erro ao criar o e-mail.", e);
			throw new Exception(e);
		}

		try {
			mailSender.send(message);
		} catch (MailException e) {
			LOGGER.error("Erro ao enviar e-mail.", e);
			throw new Exception(e);
		}

	}

	@Override
	public void sendFromTemplate(String to, String from, String subject,
			String template, Map<?, ?> templateData) throws Exception {

		String htmlTemplate = "";

		try {
			htmlTemplate = templateLoader.loadTemplate(template, templateData);
		} catch (IOException e) {
			String error = "Erro ao carregar o template: " + template;
			LOGGER.error(error, e);
			throw new ServiceException(error);
		}

		send(to, from, subject, htmlTemplate);
	}

	@Async
	@Override
	public void sendAsyncFromTemplate(String to, String from, String subject,
			String template, Map<?, ?> templateData) throws Exception {
		sendFromTemplate(to, from, subject, template, templateData);
	}

}