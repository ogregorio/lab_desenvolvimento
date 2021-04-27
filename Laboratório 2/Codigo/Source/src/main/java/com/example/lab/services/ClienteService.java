package com.example.lab.services;

import java.util.ArrayList;

import com.example.lab.models.Cliente;
import com.example.lab.models.Pedido;

public interface ClienteService {

	public Iterable<Cliente> findAll();
	
	public Cliente find(String cpf);
	
	public Cliente save(Cliente cliente);
	
	public void delete(String cpf);
	
}
