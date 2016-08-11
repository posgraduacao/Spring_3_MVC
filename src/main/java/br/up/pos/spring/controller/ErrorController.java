package br.up.pos.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Controlador que controla exceçoes
 */
@Controller
@RequestMapping("/error")
public class ErrorController extends GenericController {

	@RequestMapping(value="403", method = RequestMethod.GET)
	public String home(Model model) {
		return "error/403";
	}

}