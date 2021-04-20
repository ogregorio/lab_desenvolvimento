package com.example.lab.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Pedidos")
public class Pedido {
	
	@Id
	private int codigo;
	private String status;
	// TODO: ver como implementar no java
	private String data_inicial;
	private String data_modificacao;
	
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
	public String getData_inicial() {
		return data_inicial.toString();
	}
	public void setData_inicial(String data_inicial) {
		this.data_inicial = data_inicial.toString();
	}
	public String getData_modificacao() {
		return data_modificacao.toString();
	}
	public void setData_modificacao(String data_modificacao) {
		this.data_modificacao = data_modificacao.toString();
	}
}
