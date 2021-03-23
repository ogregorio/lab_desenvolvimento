package com.matriculas.matriculas_core;

public class Aluno {
	int id;
	int matricula;
	String[] obrigatorias;
	String[] optativas;

	public Aluno(String[] obrigatorias, String[] optativas) {
		HttpProvider httpProvider = new HttpProvider();
		String data = httpProvider.getJSON("http://localhost:3002/alunos", 10000);
		Aluno[] alunos = App.gson.fromJson(data, Aluno[].class);

		this.id = alunos.length + 1;
		this.matricula = alunos.length + 1;
		this.obrigatorias = obrigatorias;
		this.optativas = optativas;
	}
}
