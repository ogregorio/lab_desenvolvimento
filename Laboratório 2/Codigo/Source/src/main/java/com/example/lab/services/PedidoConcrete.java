package com.example.lab.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lab.models.Pedido;
import com.example.lab.repositories.PedidoRepository;

@Service("pedidoService")
public class PedidoConcrete implements PedidoService{

	@Autowired
	private PedidoRepository pedidoRepository;

	@Override
	public Pedido find(String codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pedido save(Pedido pedido) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Pedido> findAll() {
		return pedidoRepository.findAll();
	}

	@Override
	public void delete(String codigo) {
		// TODO Auto-generated method stub
		
	}

}
