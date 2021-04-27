package com.example.lab.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lab.models.Agente;
import com.example.lab.repositories.AgenteRepository;

@Service("agenteService")
public class AgenteConcrete implements AgenteService{

	@Autowired
	private AgenteRepository agenteRepository;

	@Override
	public Iterable<Agente> findAll() {
		return agenteRepository.findAll();
	}

	@Override
	public Agente find(String codigoAgente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Agente save(Agente agente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String codigoAgente) {
		// TODO Auto-generated method stub
		
	}



}
