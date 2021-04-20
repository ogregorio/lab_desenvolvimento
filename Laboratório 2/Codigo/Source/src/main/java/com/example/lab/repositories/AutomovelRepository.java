package com.example.lab.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.lab.models.Automovel;

@Repository("automovelRepository")
public interface AutomovelRepository extends CrudRepository<Automovel, Integer> {
	
}
