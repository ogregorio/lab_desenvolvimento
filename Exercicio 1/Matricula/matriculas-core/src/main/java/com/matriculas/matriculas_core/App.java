package com.matriculas.matriculas_core;

import static spark.Spark.get;
import static spark.Spark.port;
import static spark.Spark.post;
import static spark.Spark.put;

import org.apache.log4j.BasicConfigurator;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */

public class App {
	public static Gson gson = new Gson();
	public static HttpProvider httpProvider = new HttpProvider();

	public static void main(String[] args) {
		BasicConfigurator.configure();
		port(9000);
		get("/alunos", (request, response) -> {
			String data = httpProvider.getJSON("http://localhost:3002/alunos", 10000);
			Aluno[] alunos = gson.fromJson(data, Aluno[].class);
			return (gson.toJson(alunos));
		});
		post("/alunos", (request, response) -> {
			AlunoDTO alunoDados = gson.fromJson(request.body(), AlunoDTO.class);
			Aluno novoAluno = new Aluno(alunoDados.obrigatorias, alunoDados.optativas);
			String resp = httpProvider.put("http://localhost:3002/alunos", gson.toJson(novoAluno));
			return (gson.toJson(novoAluno));
		});
		put("/alunos/:matricula", (request, response) -> {
			String matricula = request.params("matricula");
			String resp = httpProvider.put("http://localhost:3002/alunos/" + matricula, request.body());

			return (gson.toJson(matricula));
		});

		get("/disciplinas", (request, response) -> {
			String data = httpProvider.getJSON("http://localhost:3002/disciplinas", 10000);
			Disciplina[] disciplinas = gson.fromJson(data, Disciplina[].class);
			return (gson.toJson(disciplinas));
		});
		post("/disciplinas", (request, response) -> {
			DisciplinaDTO disciplinaDados = gson.fromJson(request.body(), DisciplinaDTO.class);
			Disciplina novaDisciplina = new Disciplina(disciplinaDados.nome, disciplinaDados.status,
					disciplinaDados.alunos);
			String resp = httpProvider.post("http://localhost:3002/disciplinas", gson.toJson(novaDisciplina));
			return (gson.toJson(novaDisciplina));
		});
		put("/disciplinas/:disciplina", (request, response) -> {
			String idDisciplina = request.params("/disciplina");
			Disciplina disciplina = gson.fromJson(request.body(), Disciplina.class);
			if (disciplina.alunos.length < 3) {
				disciplina.status = "inativa";
			}
			String resp = httpProvider.put("http://localhost:3002/disciplinas/" + idDisciplina,
					gson.toJson(disciplina));

			return (gson.toJson(idDisciplina));
		});
	}
}
