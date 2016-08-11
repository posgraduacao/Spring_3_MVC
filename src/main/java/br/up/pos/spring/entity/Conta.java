package br.up.pos.spring.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@SuppressWarnings("serial")
public class Conta implements Serializable {
	
	@NotNull(message = "{errors.operator.mandatory}")
	@Min(value=9, message="{errors.operator.min}")
//	@Min(value=9, message="O valor minimo aceito para o campo é 9")
	private BigDecimal operator1;
	
	@NotNull(message = "{errors.operator.mandatory}")
//	@NotNull(message = "O segundo operador não pode ser nulo")
	@Digits(integer=4, fraction=2)
	private BigDecimal operator2;

	public BigDecimal getOperator1() {
		return operator1;
	}

	public void setOperator1(BigDecimal operator1) {
		this.operator1 = operator1;
	}

	public BigDecimal getOperator2() {
		return operator2;
	}

	public void setOperator2(BigDecimal operator2) {
		this.operator2 = operator2;
	}
	
	


}
