package br.up.pos.spring.controller;

import java.security.Principal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.SessionAttributes;

import br.up.pos.spring.service.EmailService;

@SessionAttributes({""})
public abstract class GenericController {

    protected final Logger logger = LoggerFactory.getLogger(GenericController.class);


    @Autowired
    protected EmailService emailService;

    /*
     */
    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(
                dateFormat, false));
    }

/*
    @ExceptionHandler(Throwable.class)
    public String handleThrowable( Throwable t, Principal principal ) {
        return "/error/http/500";
    }

    @ExceptionHandler(Exception.class)
    public String handleException( Throwable t, Principal principal ) {
        return "/error/http/500";
    }
    */

}
