package com.example.lab.services;

import com.example.lab.models.Automovel;

public interface AutomovelService {

	public Iterable<Automovel> findAll();
	
	public Automovel find(String matricula);
	
	public Automovel save(Automovel automovel);
	
	public void delete(String matricula);
	
}
