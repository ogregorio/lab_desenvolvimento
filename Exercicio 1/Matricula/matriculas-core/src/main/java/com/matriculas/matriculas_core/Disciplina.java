package com.matriculas.matriculas_core;

public class Disciplina {
	int id;
	String nome;
	String status;
	int[] alunos;

	public Disciplina(String nome, String status, int[] alunos) {
		HttpProvider httpProvider = new HttpProvider();
		String data = httpProvider.getJSON("http://localhost:3002/disciplinas", 10000);
		Disciplina[] disciplinas = App.gson.fromJson(data, Disciplina[].class);

		this.id = disciplinas.length + 1;
		this.nome = nome;
		this.status = status;
		this.alunos = alunos;
	}
}
