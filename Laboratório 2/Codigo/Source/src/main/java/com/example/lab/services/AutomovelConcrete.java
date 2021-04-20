package com.example.lab.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lab.models.Automovel;
import com.example.lab.repositories.AutomovelRepository;

@Service("automovelService")
public class AutomovelConcrete implements AutomovelService{

	@Autowired
	private AutomovelRepository automovelRepository;

	@Override
	public Automovel find(String matricula) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Automovel save(Automovel automovel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Automovel> findAll() {
		return automovelRepository.findAll();
	}

	@Override
	public void delete(String matricula) {
		// TODO Auto-generated method stub
		
	}

}
