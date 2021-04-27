package com.example.lab.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Agente")
public class Agente {
	
	@Id
	private String codigo_agente;
	

}	