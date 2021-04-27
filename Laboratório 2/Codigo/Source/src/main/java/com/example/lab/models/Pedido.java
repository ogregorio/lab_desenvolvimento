package com.example.lab.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Pedidos")
public class Pedido {

	@Id
	private int codigo;
	private String status;
	private String data_inicial;
	private String data_modificacao;
    private String codigo_agente;
    private String matricula_automovel;
    private String cpf_cliente;

	public String getData_inicial() {
		return data_inicial;
	}

	public void setData_inicial(String data_inicial) {
		this.data_inicial = data_inicial;
	}

	public String getData_modificacao() {
		return data_modificacao;
	}

	public void setData_modificacao(String data_modificacao) {
		this.data_modificacao = data_modificacao;
	}

	public String getDataInicial() {
		return data_inicial;
	}

	public String getCodigo_agente() {
		return codigo_agente;
	}

	public void setCodigo_agente(String codigo_agente) {
		this.codigo_agente = codigo_agente;
	}

	public String getMatricula_automovel() {
		return matricula_automovel;
	}

	public void setMatricula_automovel(String matricula_automovel) {
		this.matricula_automovel = matricula_automovel;
	}

	public String getCpf_cliente() {
		return cpf_cliente;
	}

	public void setCpf_cliente(String cpf_cliente) {
		this.cpf_cliente = cpf_cliente;
	}

	public void setDataInicial(String data_inicial) {
		this.data_inicial = data_inicial;
	}

	public String getDataModificacao() {
		return data_modificacao;
	}

	public void setDataModificacao(String data_modificacao) {
		this.data_modificacao = data_modificacao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
