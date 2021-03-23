package com.matriculas.matriculas_core;

public class DisciplinaDTO {
	String nome;
	String status;
	int[] alunos;

	public DisciplinaDTO(String nome, String status, int[] alunos) {
		this.nome = nome;
		this.status = status;
		this.alunos = alunos;
	}
}
