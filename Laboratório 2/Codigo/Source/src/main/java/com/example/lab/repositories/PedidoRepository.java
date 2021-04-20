package com.example.lab.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.lab.models.Pedido;

@Repository("pedidoRepository")
public interface PedidoRepository extends CrudRepository<Pedido, Integer> {
	
}
