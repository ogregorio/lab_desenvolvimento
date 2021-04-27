package com.example.lab.services;

import com.example.lab.models.Agente;

public interface AgenteService {

	public Iterable<Agente> findAll();
	
	public Agente find(String codigoAgente);
	
	public Agente save(Agente agente);
	
	public void delete(String codigoAgente);
	
}
