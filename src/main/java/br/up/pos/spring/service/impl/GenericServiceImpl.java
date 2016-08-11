package br.up.pos.spring.service.impl;

import java.text.SimpleDateFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import br.up.pos.spring.service.EmailService;
import br.up.pos.spring.service.GenericService;

public abstract class GenericServiceImpl<T> implements GenericService<T> {
    
    protected static final Logger LOGGER = LoggerFactory.getLogger(GenericServiceImpl.class);

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


    @Autowired
    protected EmailService emailService;

   

}
