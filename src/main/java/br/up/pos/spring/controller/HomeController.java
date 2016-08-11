package br.up.pos.spring.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/")
public class HomeController extends GenericController {

	@RequestMapping(method = RequestMethod.GET)
	public String home(Model model, Principal principal) {
		System.out.println("Sua aplicação esta configurada e respondendo >>>> redirecionando para a pagina inicial");
		
		return "home";
	}
}