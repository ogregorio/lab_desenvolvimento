package com.example.lab.services;

import com.example.lab.models.Pedido;

public interface PedidoService {

	public Iterable<Pedido> findAll();
	
	public Pedido find(String codigo);
	
	public Pedido save(Pedido pedido);
	
	public void delete(String codigo);
	
}
