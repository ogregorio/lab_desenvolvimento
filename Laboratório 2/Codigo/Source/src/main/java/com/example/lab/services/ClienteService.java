package com.example.lab.services;

import com.example.lab.models.Cliente;

public interface ClienteService {

	public Iterable<Cliente> findAll();
	
	public Cliente find(String cpf);
	
	public Cliente save(Cliente cliente);
	
	public void delete(String cpf);
	
}
