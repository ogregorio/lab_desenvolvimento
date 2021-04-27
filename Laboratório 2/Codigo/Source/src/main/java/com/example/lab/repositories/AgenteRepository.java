package com.example.lab.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.lab.models.Agente;

@Repository("agenteRepository")
public interface AgenteRepository extends CrudRepository<Agente, Integer> {
	
}
