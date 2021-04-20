package com.example.lab.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Cliente")
public class Cliente {

	@Id
	private String cpf;
	private String rg;
	private String nome;
	private String profissao;
	private String empregador;
	private float rendimento;

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public String getEmpregador() {
		return empregador;
	}
	public void setEmpregador(String empregador) {
		this.empregador = empregador;
	}
	public float getRendimento() {
		return rendimento;
	}
	public void setRendimento(float rendimento) {
		this.rendimento = rendimento;
	}

}
