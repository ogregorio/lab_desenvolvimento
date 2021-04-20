<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
	<title>Automoveis</title>
	</head>
	<body>
		<div>
		<h3>Automovel List</h3>
			<table>	
				<tr>
					<th>Matricula</th>
					<th>Ano</th>
					<th>Marca</th>
					<th>Placa</th>
					<th>Status</th>
					<th>Proprietario</th>
				</tr>
			<c:forEach var="automovel" items="${automoveis}">
				<tr>
					<td>${automovel.matricula}</td>
					<td>${automovel.ano}</td>
					<td>${automovel.marca}</td>
					<td>${automovel.placa}</td>
					<td>${automovel.status}</td>
					<td>${automovel.proprietario}</td>
				</tr>	
			</c:forEach>
			</table>
		</div>
	</body>
	<style>
		@import url('https://fonts.googleapis.com/css2?family=Roboto:wght@300;500&display=swap');		
		
		html {
			background: #7E6C40;
			width: 100%;
			height: 100%;
			font-family: 'Roboto', sans-serif;
			font-weight: 300;
		}

		h3 {
			text-align:center;
			color: #fff;
			font-weight: 500;
		}

		table {
			margin: auto;
			padding-bottom: 5%;
		}

		td{
			border: solid 1px #fff;
			padding: 3px;
			text-align: center;
			color: #fff;
		}

		th{
			border: solid 1px #fff;
			background: #fff;
			padding: 3px;
			text-align: center;
			color: #7E6C40;
		}

	</style>
</html>