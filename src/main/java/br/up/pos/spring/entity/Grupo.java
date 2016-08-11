package br.up.pos.spring.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Entity
@Table(name = "grupo", uniqueConstraints = @UniqueConstraint(columnNames = "perfil"))
public class Grupo implements Serializable, Comparable<Grupo> {

	private static final long serialVersionUID = 7961255626034218591L;

	@Id
	@GeneratedValue
	private Long id;

	@NotNull
	private String nome;

	@NotNull
	private String descricao;

	@NotNull
	private String perfil;

	private boolean ativo;

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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	@Override
	public int compareTo(Grupo g) {
		return CompareToBuilder.reflectionCompare(this, g);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(id).append(nome).append(descricao)
				.append(perfil).append(ativo).toHashCode();
	}

	@Override
	public boolean equals(Object grupo) {
		return EqualsBuilder.reflectionEquals(this, grupo);
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
