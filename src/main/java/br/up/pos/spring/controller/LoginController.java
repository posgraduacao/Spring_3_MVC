package br.up.pos.spring.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Controlador que faz o gerenciamento do Login
 */
@Controller
@RequestMapping("/login/**")
public class LoginController extends GenericController {

	@RequestMapping(method = RequestMethod.GET)
	public String index(Model model, Principal principal) {
		
		
		return "login/index";
	}

}