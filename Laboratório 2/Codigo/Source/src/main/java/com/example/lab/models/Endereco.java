package com.example.lab.models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Endereco")
public class Endereco {
	
	private String cep;
	private String rua;
	private String estado;
	private String cpf;
	
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
