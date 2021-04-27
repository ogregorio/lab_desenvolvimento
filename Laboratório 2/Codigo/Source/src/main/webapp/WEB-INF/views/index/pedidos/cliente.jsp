<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
	<title>Pedidos</title>
	</head>
	<body>
		<div>
		<h3>Pedido List</h3>
			<div class="menu">
				<a href="/clientes">Clientes</a>
				<a href="/automoveis">Automoveis</a>
				<a href="/pedidos">Pedidos</a>
			</div>
			<table>	
				<tr>
					<th>Codigo</th>
					<th>Status</th>
					<th>Data Inicial</th>
					<th>Data Modificacao</th>
					<th>Matricula Automovel</th>
					<th>CPF Cliente</th>
					<th>Codigo Agente</th>
				</tr>
			<c:forEach var="pedido" items="${pedidos}">
				<tr>
					<td>${pedido.codigo}</td>
					<td>${pedido.status}</td>
					<td>${pedido.data_inicial}</td>
					<td>${pedido.data_modificacao}</td>
					<td>${pedido.matricula_automovel}</td>
					<td>${pedido.cpf_cliente}</td>
					<td>${pedido.codigo_agente}</td>
				</tr>	
			</c:forEach>
			</table>
		</div>
	</body>
	<style>
		@import url('https://fonts.googleapis.com/css2?family=Roboto:wght@300;500&display=swap');		
		
		html {
			background: #4C9040;
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
			color: #4C9040;
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