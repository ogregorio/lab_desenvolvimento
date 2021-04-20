package com.example.lab.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.lab.models.Cliente;
import com.example.lab.repositories.ClienteRepository;

@Service("clienteService")
public class ClienteConcrete implements ClienteService{

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	public Iterable<Cliente> findAll() {
		return clienteRepository.findAll();
	}

	@Override
	public Cliente find(String cpf) {
		return null;
	}

	@Override
	public Cliente save(Cliente cliente) {
		return null;
	}

	@Override
	public void delete(String cpf) {
		// void
	}

}
