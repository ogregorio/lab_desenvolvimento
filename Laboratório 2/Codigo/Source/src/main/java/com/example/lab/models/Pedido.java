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
	private Date data_inicial;
	private Date data_modificacao;
	
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
	public Date getData_inicial() {
		return data_inicial;
	}
	public void setData_inicial(Date data_inicial) {
		this.data_inicial = data_inicial;
	}
	public Date getData_modificacao() {
		return data_modificacao;
	}
	public void setData_modificacao(Date data_modificacao) {
		this.data_modificacao = data_modificacao;
	}
}
