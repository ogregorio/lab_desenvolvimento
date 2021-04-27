package com.example.lab.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lab.models.Pedido;
import com.example.lab.repositories.PedidoRepository;

@Service("pedidoService")
public class PedidoConcrete implements PedidoService{

	@Autowired
	private PedidoRepository pedidoRepository;

	@Override
	public Pedido find(String cpf) {
		Iterable<Pedido> pedidos = pedidoRepository.findAll();
		for(Pedido pedido : pedidos) {
			if(cpf.equals(pedido.getCpf_cliente()))
				return pedido;
		}
		return null;
	}

	@Override
	public Pedido save(Pedido pedido) {
		return pedidoRepository.save(pedido);
	}

	@Override
	public Iterable<Pedido> findAll() {
		return pedidoRepository.findAll();
	}

	@Override
	public void delete(String codigo) {
		// TODO Auto-generated method stub
		
	}
	
	public Iterable<Pedido> findByCpf(String cpf) {
		Iterable<Pedido> pedidos = pedidoRepository.findAll();
		ArrayList<Pedido> pedidosSerializados = new ArrayList<Pedido>();
		for(Pedido pedido : pedidos) {
			if(cpf.equals(pedido.getCpf_cliente()))
				pedidosSerializados.add(pedido);
		}
		return pedidosSerializados;
	}

}
