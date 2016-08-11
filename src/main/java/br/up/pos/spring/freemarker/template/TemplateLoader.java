package br.up.pos.spring.freemarker.template;

import java.io.IOException;
import java.util.Map;

public interface TemplateLoader {

	String loadTemplate(String templateFile, Map<?, ?> templateData) throws IOException;

}
