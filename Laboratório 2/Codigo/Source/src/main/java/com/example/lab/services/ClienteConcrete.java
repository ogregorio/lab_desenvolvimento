package com.example.lab.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.lab.models.Cliente;
import com.example.lab.repositories.ClienteRepository;

@Service
public class ClienteConcrete implements ClienteService{

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	public Iterable<Cliente> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente find(String cpf) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente save(Cliente cliente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String cpf) {
		// TODO Auto-generated method stub
		
	}

}
