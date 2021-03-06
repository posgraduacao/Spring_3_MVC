package br.up.pos.spring.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "usuario", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
@SuppressWarnings("serial")
public class Usuario implements Serializable {

	@Id
	@GeneratedValue
	private Long id;

	@Size(min = 0, max = 255)
	private String nome;

	@NotNull
	@NotEmpty
	@Email
	@Column(unique = true)
	private String email;

	@Column
	private String senha;

	@Column
	private boolean ativo;
	
	private String accessRules;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getAccessRules() {
		return accessRules;
	}

	public void setAccessRules(String accessRules) {
		this.accessRules = accessRules;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

}
