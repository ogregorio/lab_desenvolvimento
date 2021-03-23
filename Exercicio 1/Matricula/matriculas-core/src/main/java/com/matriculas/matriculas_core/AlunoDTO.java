package com.matriculas.matriculas_core;

public class AlunoDTO {
	String[] obrigatorias;
	String[] optativas;

	public AlunoDTO(String[] obrigatorias, String[] optativas) {
		this.obrigatorias = obrigatorias;
		this.optativas = optativas;
	}
}
