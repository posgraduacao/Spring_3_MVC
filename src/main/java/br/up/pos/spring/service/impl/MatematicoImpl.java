package br.up.pos.spring.service.impl;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import br.up.pos.spring.entity.Conta;
import br.up.pos.spring.service.Matematico;

@Service("matematico1")
public class MatematicoImpl implements Matematico {
	
	/* (non-Javadoc)
	 * @see br.up.pos.spring.service.impl.Matematico#somar(br.up.pos.spring.entity.Conta)
	 */
	@Override
	public BigDecimal somar(Conta conta) {
		return conta.getOperator1().add( conta.getOperator2() );
	}

}
