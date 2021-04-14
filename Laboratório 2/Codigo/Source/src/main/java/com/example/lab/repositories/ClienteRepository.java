package com.example.lab.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.lab.models.Cliente;

@Repository("clienteRepository")
public interface ClienteRepository extends CrudRepository<Cliente, Integer> {
	
}
