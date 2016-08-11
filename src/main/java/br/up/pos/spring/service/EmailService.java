package br.up.pos.spring.service;

import java.util.Map;

import org.hibernate.service.spi.ServiceException;

/**
 * Serviço responsável pelo envio de e-mail.
 * 
 */
public interface EmailService {

	/**
	 * Envia um email de forma síncrona.
	 * 
	 * @param to
	 *            Destinatário que receberá o e-mail.
	 * @param from
	 *            Quem está enviando o e-mail.
	 * @param subject
	 *            Assunto do e-mail.
	 * @param text
	 *            Corpo do e-mail.
	 * @throws Exception
	 */
	void send(final String to, final String from, final String subject,
			final String text) throws Exception;

	/**
	 * Envia um email de forma síncrona.
	 * 
	 * @param to
	 *            Destinatários que receberão o e-mail.
	 * @param from
	 *            Quem está enviando o e-mail.
	 * @param subject
	 *            Assunto do e-mail.
	 * @param text
	 *            Corpo do e-mail.
	 * @throws ServiceException
	 */
	void send(final String[] to, final String from, final String subject,
			final String text) throws Exception;

	/**
	 * Envia um email de forma assíncrona.
	 * 
	 * @param to
	 *            Para onde será enviado o e-mail.
	 * @param from
	 *            Quem está enviando o e-mail.
	 * @param subject
	 *            Assunto do e-mail.
	 * @param text
	 *            Corpo do e-mail.
	 * @throws ServiceException
	 */
	void sendAsync(final String to, final String from, final String subject,
			final String text) throws Exception;

	/**
	 * 
	 * @param to
	 * @param from
	 * @param subject
	 * @param template
	 * @param templateData
	 * @throws ServiceException
	 */
	void sendFromTemplate(final String to, final String from,
			final String subject, final String template,
			final Map<?, ?> templateData) throws Exception;

	/**
	 * 
	 * @param to
	 * @param from
	 * @param subject
	 * @param template
	 * @param templateData
	 * @throws ServiceException
	 */
	void sendAsyncFromTemplate(final String to, final String from,
			final String subject, final String template,
			final Map<?, ?> templateData) throws Exception;
}
