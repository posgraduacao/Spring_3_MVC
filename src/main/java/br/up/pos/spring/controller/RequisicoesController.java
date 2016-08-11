package br.up.pos.spring.controller;

import java.math.BigDecimal;
import java.security.Principal;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import br.up.pos.spring.entity.Conta;
import br.up.pos.spring.service.Matematico;

@Controller
@RequestMapping("/requisicao")
public class RequisicoesController extends GenericController {

	@Autowired
	@Qualifier("matematico1")
	private Matematico matematico;

	@Autowired
	private MessageSource messages;

	@RequestMapping(value = { "/calcular", "fazai" }, method = { RequestMethod.GET, RequestMethod.POST })
	public String calcular(Model model, Principal principal) {

		System.out.println(principal.getName());

		model.addAttribute("conta", new Conta());

		return "default/conta";
	}

	@ResponseBody
	@ResponseStatus(value = HttpStatus.OK)
	@RequestMapping(value = { "/felipe" }, method = { RequestMethod.GET, RequestMethod.POST })
	public Conta conta() {
		Conta ct = new Conta();
		return ct;
	}

	@RequestMapping(value = "/calcular/somar", method = RequestMethod.POST)
	public String somar(Model model, @Valid @ModelAttribute Conta conta, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			// return "forward:/requisicao/calcular"; //Request method 'POST'
			// not supported
			// return "redirect:/requisicao/calcular";
			return "default/conta"; // TODO Diferença entre return
									// direto/redirect/forward
		}
		// BigDecimal operador1 = conta.getOperator1();
		// BigDecimal operador2 = conta.getOperator2();
		BigDecimal resultado = matematico.somar(conta);
		String msg = "O resultado da operação é " + resultado;

		// String msg =
		// messages.getMessage("message.success", // Chave da mensagem
		// new Object [] {operador1, operador2, resultado},
		// "Mensagem default caso nao encontre.",
		// null); // Locale

		model.addAttribute("resultado", msg);

		return "default/resposta";
	}

}