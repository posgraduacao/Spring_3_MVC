package br.up.pos.spring.service;

import java.math.BigDecimal;

import br.up.pos.spring.entity.Conta;

public interface Matematico {

	BigDecimal somar(Conta conta);

}