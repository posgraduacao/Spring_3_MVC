package br.up.pos.spring.freemarker.template;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.up.pos.spring.service.impl.EmailServiceImpl;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

@Named
public class FreemarkerTemplateLoaderImpl implements TemplateLoader {

	private static final Logger LOGGER = LoggerFactory.getLogger(EmailServiceImpl.class);

	private Configuration configuration = new Configuration();

	public FreemarkerTemplateLoaderImpl() {
		configuration.setClassForTemplateLoading(this.getClass(), "/");
	}

	@Override
	public String loadTemplate(String templateFile, Map<?, ?> templateData) throws IOException {

		LOGGER.debug("Carregando o template: {}", templateFile);

		Template template = configuration.getTemplate(templateFile);

		Writer out = new StringWriter();

		try {
			template.process(templateData, out);
		} catch (TemplateException e) {
			LOGGER.error("Erro ao processar o template.", e);
		}

		return out.toString();
	}

}
