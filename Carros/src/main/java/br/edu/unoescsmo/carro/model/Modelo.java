package br.edu.unoescsmo.carro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CPF;

@Entity
public class Modelo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_modelo")
	private Long codigo;

	@Column(name = "tx_nome", length = 150, nullable = false)
	@NotEmpty(message = "nome deve ser preenchido")
	private String nome;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "marca")
	private Marca marca;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "versao")
	private Versao versao;


	public Long getCodigo() {
		return codigo;
	}


	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Marca getMarca() {
		return marca;
	}


	public void setMarca(Marca marca) {
		this.marca = marca;
	}


	public Versao getVersao() {
		return versao;
	}


	public void setVersao(Versao versao) {
		this.versao = versao;
	}


}
