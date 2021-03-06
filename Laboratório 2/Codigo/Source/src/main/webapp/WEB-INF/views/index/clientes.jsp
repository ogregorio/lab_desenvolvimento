<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
	<title>Clientes</title>
	</head>
	<body>
		<div>
		<h3>Cliente List</h3>
			<div class="menu">
				<a href="/clientes">Clientes</a>
				<a href="/automoveis">Automoveis</a>
				<a href="/pedidos">Pedidos</a>
			</div>
			<table>	
				<tr>
					<th>Nome</th>
					<th>CPF</th>
					<th>RG</th>
					<th>Profissao</th>
					<th>Empregador</th>
					<th>Rendimento</th>
					<th>Pedidos</th>
				</tr>
			<c:forEach var="cliente" items="${clientes}">
				<tr>
					<td>${cliente.nome}</td>
					<td>${cliente.cpf}</td>
					<td>${cliente.rg}</td>
					<td>${cliente.profissao}</td>
					<td>${cliente.empregador}</td>
					<td>R$ ${cliente.rendimento}</td>
					<td><a href="${pageContext.request.contextPath}/pedidos/cliente/${cliente.cpf}" >Ver Pedidos</a></td>
				</tr>	
			</c:forEach>
			</table>
		</div>
	</body>
	<style>
		@import url('https://fonts.googleapis.com/css2?family=Roboto:wght@300;500&display=swap');		
		
		html {
			background: #7475EB;
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
			color: #7475EB;
		}

		
		.menu {
			display: flex;
			width: 100%;
			text-align: center;
			justify-content: center;
		}

		.menu a {
			color: #fff;
			text-decoration: none;
			margin: 10px;
		}

		.menu a:hover {
			text-decoration: underline;
		}

	</style>
</html>