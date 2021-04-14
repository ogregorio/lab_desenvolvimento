package com.example.lab.services;

import org.springframework.stereotype.Service;
import com.example.lab.models.Cliente;

@Service
public interface ClienteService {

	public Iterable<Cliente> findAll();
	
	public Cliente find(String cpf);
	
	public Cliente save(Cliente cliente);
	
	public void delete(String cpf);
	
}
